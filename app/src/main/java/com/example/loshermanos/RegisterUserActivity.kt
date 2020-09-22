package com.example.loshermanos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.register_user.*

class RegisterUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_user)

    btn_cadastrar_user.setOnClickListener{
        var intent = Intent(this,MainActivity::class.java)
        Toast.makeText(this, "Usuário cadastrado com sucesso!!", Toast.LENGTH_LONG).show()
        startActivity(intent)
    }

    }
}