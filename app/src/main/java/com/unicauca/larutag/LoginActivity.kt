package com.unicauca.larutag

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.unicauca.larutag.databinding.ActivityLoginBinding
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val binding: ActivityLoginBinding = DataBindingUtil
                .setContentView(this,R.layout.activity_login)
        binding.handler = this
    }
    fun login(){
    startActivity<MainActivity>()
        finish()
        //Para que cuando le de el botón de atrás, se ciere l
    }
    fun signin(){

    }
}
