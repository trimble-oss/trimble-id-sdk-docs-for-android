package com.trimble.tid.sample.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.appcompat.app.AppCompatActivity
import com.trimble.id.android.Authenticator
import com.trimble.id.android.ILoginResponseCallback
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * ViewModel that interacts with TID Mobile SDK
 */

@HiltViewModel
class LoginViewModel @Inject constructor(private val authenticator: Authenticator) :ViewModel() {

    private val _loginResult = MutableLiveData<Boolean>()
    val loginResult: LiveData<Boolean> = _loginResult
    /**
     * Register the handler of login before invoking login
     */
    fun registerLoginLauncher(context: AppCompatActivity) {
        authenticator.registerLoginLauncher(context = context)
    }

    /**
     * Invoke registerLoginLauncher before invoking login.
     * On completion of login, _loginResult is updated
     */
    fun login(launchAsTrustedWebActivity: Boolean = false) {
        authenticator.login(object : ILoginResponseCallback {
            override fun onLoginCompleted(loginResult: Result<Boolean>) {
                loginResult.onSuccess {
                    _loginResult.value = true
                }
                loginResult.onFailure {
                    _loginResult.value = false
                }
            }
        }, launchAsTrustedWebActivity)
    }
}

