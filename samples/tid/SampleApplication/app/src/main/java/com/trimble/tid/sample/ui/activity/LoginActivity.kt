package com.trimble.tid.sample.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.trimble.tid.sample.databinding.ActivityLoginBinding
import com.trimble.tid.sample.ui.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val login = binding.login

        loginViewModel = ViewModelProvider(this)[LoginViewModel::class.java]

        // This method needs to be invoked in the onCreate() or onStart() of the LifecycleOwner before login to handle login result
        loginViewModel.registerLoginLauncher(this)

        loginViewModel.loginResult.observe(this) {
            if (it) {
                Toast.makeText(this, "User logged in successfully", Toast.LENGTH_LONG).show()
                startActivity(Intent(this, HomeActivity::class.java))
                this.finish()
            } else {
                Toast.makeText(this, "Login unsuccessful", Toast.LENGTH_LONG).show()
            }
        }

        //To launch the TID login page as a Trusted Web activity, pass true as a parameter in the login method
        login.setOnClickListener {
            loginViewModel.login()
        }

    }
}