package dev.lucy.myaccesoriesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lucy.myaccesoriesapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.tvNext.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
        fun validateLogin() {
            val name = binding.tietName.text.toString()
            val password = binding.tietPasswroed.text.toString()
            if (name.isBlank()) {
                binding.tietName.error = "Username is required"
            }
            if (password.isBlank()) {
                binding.tietPasswroed.error = "Username is required"
            }
        }
    }

}