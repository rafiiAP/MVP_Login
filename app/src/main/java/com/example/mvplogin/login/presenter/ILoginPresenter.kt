package com.example.mvplogin.login.presenter

interface ILoginPresenter {

    fun clear()
    fun showProgress()
    fun hideProgress()
    fun login(id: String, password: String)
}