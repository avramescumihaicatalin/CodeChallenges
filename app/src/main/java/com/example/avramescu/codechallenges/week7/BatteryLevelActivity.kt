package com.example.avramescu.codechallenges.week7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.example.avramescu.codechallenges.R

class BatteryLevelActivity : AppCompatActivity() {

    private lateinit var mBatteryImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battery_level)

        initView()
    }

    private fun initView() {
        mBatteryImage = findViewById(R.id.image_view_battery_levels)
    }

    fun addLevelToBattery(view: View) {
        var currentBatteryLevel = mBatteryImage.drawable.level
        if (currentBatteryLevel < 3) {
            mBatteryImage?.setImageLevel(currentBatteryLevel+1)
        }
        Log.d(BatteryLevelActivity::class.java.simpleName, "currentBatteryLevel: $currentBatteryLevel")

    }
    fun removeLevelFromBattery(view: View) {
        var currentBatteryLevel = mBatteryImage.drawable.level

        if (currentBatteryLevel > 0) {
            mBatteryImage?.setImageLevel(currentBatteryLevel-1)
        }
        Log.d(BatteryLevelActivity::class.java.simpleName, "currentBatteryLevel: $currentBatteryLevel")
    }
}
