package com.example.mvplogin.login.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.TextView
import com.example.mvplogin.R

class LoginActivity : AppCompatActivity(), ILoginView {

    private lateinit var textViewLoginResultInfo : TextView
    private lateinit var buttonLogin : Button
    private lateinit var editTextID : EditText
    private lateinit var editTextPW : EditText
    private lateinit var frameLayoutProgress : FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findView()
        setListener()

    }

    private fun findView(){
        textViewLoginResultInfo = findViewById(R.id.textViewLoginResultInfo)
        buttonLogin = findViewById(R.id.buttonLogin)
        editTextID = findViewById(R.id.editTextID)
        editTextPW = findViewById(R.id.editTextPW)
        frameLayoutProgress = findViewById(R.id.frameLayoutProgress)


    }

    private fun setListener(){
        buttonLogin.setOnClickListener {

        }
    }

    override fun onClear() {
        editTextID.setText("")
        editTextPW.setText("")
    }

    override fun onShowProgress() {
        frameLayoutProgress.visibility = View.VISIBLE
    }

    override fun onHideProgress() {
        frameLayoutProgress.visibility = View.GONE
    }

    override fun onUpdateLoginResultInfo(nickname: String, age: Int) {
        textViewLoginResultInfo.text = "nickname is $nickname, age is $age"
    }
}