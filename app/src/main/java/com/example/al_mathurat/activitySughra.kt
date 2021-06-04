package com.example.al_mathurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class activitySughra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sughra)

        val actionbar = supportActionBar
        actionbar!!.title = "Sughra"
    }
}