package com.example.loshermanos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.btn_login

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_login.setOnClickListener{

            val valor_cadastro_nome = campo_cadastro_nome.text.toString()
            val valor_cadastro_telefone = campo_cadastro_telefone.text.toString()
            val valor_cadastro_email = campo_cadastro_email.text.toString()
            val valor_cadastro_senha_ = campo_cadastro_senha.text.toString()
            Toast.makeText(this, "$valor_cadastro_nome : $valor_cadastro_telefone : $valor_cadastro_email : $valor_cadastro_senha_", Toast.LENGTH_LONG).show()
        }
    }
}
