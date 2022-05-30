package com.example.mvplogin.login.presenter.controller

object LoginController {

    interface LoginControllerDelegate{
        fun onSuccess(response: String)
        fun onFailed()
    }

    fun requestLogin(id: String, password: String, delegate: LoginControllerDelegate){


    }
}