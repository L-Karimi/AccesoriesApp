package dev.lucy.myaccesoriesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var intent=Intent(this,SplashActivity::class.java)
        startActivity(intent)
        finish()
    }
}