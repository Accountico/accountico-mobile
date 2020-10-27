package com.example.loshermanos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*
import com.example.loshermanos.TelaInicialActivity

class MainActivity : DegubActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        campo_usuario.setText(Prefs.getString("lembrarNome"))
        campo_senha.setText(Prefs.getString("lembrarSenha"))
        checkLembrar.isChecked = Prefs.getBoolean("lembrar")



        btn_login.setOnClickListener{
            val valor_usuario = campo_usuario.text.toString()
            val valor_senha = campo_senha.text.toString()

            Prefs.setBoolean("lembrar", checkLembrar.isChecked)
            if (checkLembrar.isChecked){
                Prefs.setString("lembrarNome", valor_usuario)
                Prefs.setString("lembrarSenha", valor_senha)
            }else{
                Prefs.setString("lembrarNome","")
                Prefs.setString("lembrarSenha", "")
            }

            var intent = Intent(this, TelaInicialActivity::class.java)
            startActivity(intent)


            }
        btn_cadastrar.setOnClickListener {
            var intent = Intent(this, RegisterUserActivity::class.java)
            startActivity(intent)
        }
        }
    }



