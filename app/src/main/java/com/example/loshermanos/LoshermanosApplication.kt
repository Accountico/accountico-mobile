package com.example.loshermanos

import android.app.Application

class LoshermanosApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        appInstance = this

    }
    companion object {
        private var  appInstance: LoshermanosApplication? = null
        fun getInstance (): LoshermanosApplication{
           if (appInstance == null){
               throw  IllegalStateException("Configure application no manifest")
           }
            return appInstance!!
        }
    }
}