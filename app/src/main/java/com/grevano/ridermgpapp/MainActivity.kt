package com.grevano.ridermgpapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnPress(view: View) {
        val img = findViewById<ImageView>(R.id.gimages)
        val id = view.id
        if (id == R.id.btn73){
            img.setImageResource(R.drawable.alexmarquez)
        } else if (id == R.id.btnDE20) {
            img.setImageResource(R.drawable.dimasekky)
        } else if (id == R.id.btnJM88) {
            img.setImageResource(R.drawable.jorgemartin)
        } else if (id == R.id.btnLB7) {
            img.setImageResource(R.drawable.lorenzobaldassari)
        } else if (id == R.id.btnLM10) {
            img.setImageResource(R.drawable.lucamarini)
        } else if (id == R.id.btnXV97) {
            img.setImageResource(R.drawable.xavivierge)
        }
    }



}
