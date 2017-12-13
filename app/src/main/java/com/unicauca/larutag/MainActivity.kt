package com.unicauca.larutag
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.unicauca.larutag.fragments.BlankFragment


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        putFragment(R.id.container, BlankFragment.instance())
    }

    fun putFragment(container:Int, fragment: Fragment){
        supportFragmentManager.beginTransaction()
                .replace(container,fragment)
                .commit()
    }
}