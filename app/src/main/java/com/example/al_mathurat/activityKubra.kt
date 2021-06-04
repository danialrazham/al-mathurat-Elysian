package com.example.al_mathurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class activityKubra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kubra)

        val actionbar = supportActionBar
        actionbar!!.title = "Kubra"
    }
}