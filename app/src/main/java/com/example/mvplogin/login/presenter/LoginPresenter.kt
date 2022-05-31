package com.example.mvplogin.login.presenter

import android.util.Log
import com.example.mvplogin.framework.util.thread.ThreadUtil
import com.example.mvplogin.login.model.UserInfoModel
import com.example.mvplogin.login.presenter.controller.LoginController
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

        showProgress()

        LoginController.requestLogin(id = id, password = password, object: LoginController.LoginControllerDelegate{
            override fun onSuccess(response: String) {
                Log.d("???", "onSuccess $response")

                val userInfoModel = UserInfoModel()
                userInfoModel.nickname = "Coding with cat"
                userInfoModel.age = 1

                ThreadUtil.startUIThread(0){
                    hideProgress()

                    iLoginView.onUpdateLoginResultInfo(nickname = userInfoModel.nickname, age = userInfoModel.age)
                }
            }

            override fun onFailed() {
                Log.d("???", "onFailed")
                hideProgress()
            }

        })

    }
}