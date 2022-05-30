package com.example.mvplogin.login.presenter

import com.example.mvplogin.login.view.ILoginView

class LoginPresenter(var iLoginView: ILoginView): ILoginPresenter {
    override fun clear() {
        iLoginView.onClear()
    }

    override fun showProgress() {
        iLoginView.onShowProgress()
    }

    override fun hideProgress() {
        iLoginView.onHideProgress()
    }

    override fun login(id: String, password: String) {

    }
}