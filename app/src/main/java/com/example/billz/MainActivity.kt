package com.example.billz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.billz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btregister.setOnClickListener {
            var intent= Intent(this, login::class.java)
            startActivity(intent)
            val username = binding.edusername.text.toString().trim()
            val password = binding.edipassword.text.toString().trim()

            if (username.isEmpty()) {
                binding.edusername.error = "Username is required"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                binding.edipassword.error = "Password is required"
                return@setOnClickListener
            }
    }
}
     }