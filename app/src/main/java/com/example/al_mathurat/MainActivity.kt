package com.example.al_mathurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.content.SharedPreferences
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appSettingPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
        val isNightModeOn: Boolean = appSettingPrefs.getBoolean("NightMode", false)
        val sharedPrefsEdit: SharedPreferences.Editor = appSettingPrefs.edit()
        val switch: Switch = findViewById(R.id.switch_Dark)

        if(isNightModeOn){                                                  //is this crashing the app?
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        // using OnClickListener instead of a function for the switch was the right move, works now
        // now need to finish making dark mode resources and it should be all good (hopefully)
        switch.setOnClickListener(View.OnClickListener {
            if(isNightModeOn) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                sharedPrefsEdit.putBoolean("NightMode", false)
                sharedPrefsEdit.apply()
            }
            else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                sharedPrefsEdit.putBoolean("NightMode", true)
                sharedPrefsEdit.apply()
            }
        })

    }


    fun gotoSughra(view: View){       //takes us to sughra activity
        val intent = Intent(this, activitySughra::class.java)
        startActivity(intent)
    }

    fun gotoKubra(view: View){
        val intent = Intent(this, activityKubra::class.java)
        startActivity(intent)
    }

    /*fun onDarkMode(view: View){      -this ended up not working, no idea why though i could not define the needed variables globally hmm whatever
        if(isNightModeOn) {                 - leaving this here for reference i guess lol
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            sharedPrefsEdit.putBoolean("NightMode", false)
            sharedPrefsEdit.apply()
        }
        else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            sharedPrefsEdit.putBoolean("NightMode", true)
            sharedPrefsEdit.apply()
        }
    }*/

}

