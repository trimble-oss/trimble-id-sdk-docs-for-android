package com.trimble.tid.sample.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.trimble.tid.sample.databinding.ActivityHomeBinding
import com.trimble.tid.sample.ui.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var homeViewModel: HomeViewModel

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val logout = binding.logoutBtn

        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        // This method needs to be invoked in the onCreate() or onStart() of the LifecycleOwner before logout to handle logout result
        homeViewModel.registerLogoutLauncher(this)

        // Get user info of authenticated user
        homeViewModel.getUserInfo()

        homeViewModel.logoutResult.observe(this) {
            if (it) {
                Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
                this.finish()
            } else {
                Toast.makeText(this, "Unable to logout", Toast.LENGTH_SHORT).show()
            }
        }
        homeViewModel.userResult.observe(this) {
            if (it != null) {
                val firstName = binding.firstName
                val familyName = binding.familyName
                val email = binding.email
                firstName.text = it.givenName
                familyName.text = it.familyName
                email.text = it.email
            } else {
                Toast.makeText(this, "Unable to retrieve user data", Toast.LENGTH_LONG).show()
            }
        }

        logout.setOnClickListener {
            homeViewModel.logout()
        }

    }
}