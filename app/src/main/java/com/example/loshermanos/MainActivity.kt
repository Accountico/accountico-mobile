package com.example.loshermanos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*

class MainActivity : DegubActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        btn_login.setOnClickListener{

            val valor_usuario = campo_usuario.text.toString()
            val valor_senha = campo_senha.text.toString()
            Toast.makeText(this, "$valor_usuario : $valor_senha", Toast.LENGTH_LONG).show()
        }
    }
}