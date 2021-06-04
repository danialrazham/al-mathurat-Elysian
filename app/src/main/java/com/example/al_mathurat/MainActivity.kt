package com.example.al_mathurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    fun gotoSughra(view: View){       //takes us to sughra activity
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, activitySughra::class.java)
            startActivity(intent)
        })


    }

    fun gotoKubra(view: View){
        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener(View.OnClickListener {
            val intent =  Intent(this, activityKubra::class.java)
            startActivity(intent)
        })
    }

}

