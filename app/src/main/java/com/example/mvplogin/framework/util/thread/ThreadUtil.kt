package com.example.mvplogin.framework.util.thread

import java.util.concurrent.Executors
import java.util.logging.Handler

class ThreadUtil {

    companion object{

        private val excecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
        private val handler = Handler(looper.getMainLooper())

        fun startThread(runnable: Runnable){
            excecutorService.submit(runnable)
        }

        fun startUIThread(delayMillis: Int, runnable: Runnable){
            handler.postDelayed(runnable, delayMillis.toLong())
        }
    }

    protected fun finalize(){
        if (!excecutorService.isShutdown){
            excecutorService.isShutdown()
        }
    }
}