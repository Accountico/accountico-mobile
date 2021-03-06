package com.example.loshermanos

import android.content.Intent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService: FirebaseMessagingService() {
    override fun onNewToken(token: String?) {
        super.onNewToken(token)

        Log.d("Lh_FB", token!!)

        Prefs.setString("FB_TOKEN", token!!)


    }

    override fun onMessageReceived(mensagemRemota: RemoteMessage?) {
        if(mensagemRemota?.notification != null){
            val titulo = mensagemRemota?.notification?.title
            val corpo = mensagemRemota?.notification?.body
            Log.d("LH_FB", titulo!!)
            Log.d("LMS_FB",corpo!!)
            showNotification(mensagemRemota)
        }
    }
    private fun showNotification(mensagemRemota: RemoteMessage){
        val intent = Intent(this, TelaInicialActivity::class.java)
        val titulo = mensagemRemota?.notification?.title
        val corpo = mensagemRemota?.notification?.body

        NotificationUtil.create(1, intent, titulo!!, corpo!!)

    }
}