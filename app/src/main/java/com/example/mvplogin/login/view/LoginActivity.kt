package com.example.mvplogin.login.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import com.example.mvplogin.MainActivity
import com.example.mvplogin.R
import com.example.mvplogin.login.model.UserInfoModel
import com.example.mvplogin.login.presenter.ILoginPresenter
import com.example.mvplogin.login.presenter.LoginPresenter

class LoginActivity : AppCompatActivity(), ILoginView {

    private lateinit var buttonLogin : Button
    private lateinit var editTextID : EditText
    private lateinit var editTextPW : EditText
    private lateinit var frameLayoutProgress : FrameLayout

    private lateinit var iLoginPresenter: ILoginPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initPresenter()

        findView()
        setListener()

    }

    private fun initPresenter(){
        iLoginPresenter = LoginPresenter(iLoginView = this)
    }

    private fun findView(){
        buttonLogin = findViewById(R.id.buttonLogin)
        editTextID = findViewById(R.id.et_id)
        editTextPW = findViewById(R.id.et_pwd)
        frameLayoutProgress = findViewById(R.id.frameLayoutProgress)


    }

    private fun setListener(){
        buttonLogin.setOnClickListener {
            val inputId = editTextID.text.toString().trim()
            val inputPw = editTextPW.text.toString().trim()

            if (inputId.isEmpty()){
                editTextID.error = "Mohon masukan Email"
            }
            else if (inputPw.isEmpty()){
                editTextPW.error = "Mohon masukan password"
            }
            else  {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
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


}