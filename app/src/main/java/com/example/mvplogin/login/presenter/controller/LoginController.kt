package com.example.mvplogin.login.presenter.controller

import com.example.mvplogin.framework.util.thread.ThreadUtil

object LoginController {

    interface LoginControllerDelegate{
        fun onSuccess(response: String)
        fun onFailed()
    }

    fun requestLogin(id: String, password: String, delegate: LoginControllerDelegate){

        ThreadUtil.startThread{

            //fetching data
            Thread.sleep(3000)

            //get respons
            delegate.onSuccess("response from server, user info is a JsonObjectString, you need parsing it.")
        }


    }
}