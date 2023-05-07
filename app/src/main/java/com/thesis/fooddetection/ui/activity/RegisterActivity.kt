package com.thesis.fooddetection.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.thesis.fooddetection.databinding.ActivityLoginBinding
import com.thesis.fooddetection.databinding.ActivityRegisterBinding
import kotlin.math.sign

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var signUpButton: Button
    private lateinit var loginTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firstNameEditText = binding.etFname
        lastNameEditText = binding.etLname
        ageEditText = binding.etAge
        emailEditText = binding.etEmail
        passwordEditText = binding.etFpassword
        confirmPasswordEditText = binding.etFpassword
        signUpButton = binding.btnSignup
        loginTextView = binding.tvLogin

        supportActionBar?.title = "Register"

        loginTextView.setOnClickListener { clickLogin() }
    }

    private fun clickLogin() {
        val i = Intent(this, LoginActivity::class.java)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(i)
        finish()
    }
}