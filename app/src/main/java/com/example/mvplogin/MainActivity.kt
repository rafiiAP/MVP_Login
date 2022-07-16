package com.example.mvplogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mvplogin.login.view.LoginActivity

/**
*build view and view's interface. before that, let see what is mvp
 */

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("berhasil login")
    }

}
