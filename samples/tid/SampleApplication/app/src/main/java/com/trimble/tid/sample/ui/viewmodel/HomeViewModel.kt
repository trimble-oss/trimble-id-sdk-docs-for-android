package com.trimble.tid.sample.ui.viewmodel

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.trimble.id.android.Authenticator
import com.trimble.id.android.ILogoutResponseCallback
import com.trimble.id.android.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel that interacts with TID Mobile SDK
 */
@HiltViewModel
class HomeViewModel @Inject constructor(private val authenticator: Authenticator) : ViewModel() {

    private val _userResult = MutableLiveData<User?>()
    val userResult: LiveData<User?> = _userResult

    private val _logoutResult = MutableLiveData<Boolean>()
    val logoutResult: LiveData<Boolean> = _logoutResult

    /**
     * Register the handler of logout before invoking logout
     */
    fun registerLogoutLauncher(context: AppCompatActivity) {
        authenticator.registerLogoutLauncher(context = context)
    }

    /**
     * Get user info of authenticated user
     *
     */
    fun getUserInfo() {
        CoroutineScope(Dispatchers.IO).launch{
            _userResult.postValue(authenticator.getUserInfo())
        }
    }

    /**
     * Logout functionality
     * Invoke registerLogoutLauncher before invoking logout
     * On completion of logout, _logoutResult is updated
     */
    fun logout() {
        authenticator.logout(object : ILogoutResponseCallback {
            override fun onLogoutCompleted(logoutResult: Result<Boolean>) {
                logoutResult.onSuccess {
                    _logoutResult.value = true
                }.onFailure {
                    _logoutResult.value = false
                }
            }
        })
    }
}

