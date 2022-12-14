package com.example.fuel

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var tvWelcomeMsg: TextView
    private lateinit var etEmail: EditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        tvWelcomeMsg = findViewById(R.id.loginActivity_tv_welcome)
        etEmail = findViewById(R.id.loginActivity_et_email)
        btnRegister = findViewById(R.id.btnRegister)

        /*TODO: change gradient values*/
        val shader = LinearGradient(
            0f, 0f, 0f, tvWelcomeMsg.textSize,
            Color.RED, Color.BLUE, Shader.TileMode.CLAMP
        )
        tvWelcomeMsg.paint.shader = shader

        CornerDrawable.roundCorners(etEmail, 20f)

        /*TODO: implement e-mail validity check*/
        btnRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}