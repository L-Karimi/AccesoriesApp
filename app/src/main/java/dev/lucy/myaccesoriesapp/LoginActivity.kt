package dev.lucy.myaccesoriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lucy.myaccesoriesapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}