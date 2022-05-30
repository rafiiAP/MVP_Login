package com.example.mvplogin.login.view

import android.provider.ContactsContract

interface ILoginView {

    fun onClear()
    fun onShowProgress()
    fun onHideProgress()
    fun onUpdateLoginResultInfo(nickname: String, age: Int)
}