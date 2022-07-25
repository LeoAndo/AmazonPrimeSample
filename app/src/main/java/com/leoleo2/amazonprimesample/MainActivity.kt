package com.leoleo2.amazonprimesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appLaunchHelper = AppLaunchHelper(this)
        findViewById<View>(R.id.buttonLaunchApp).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(MovieData.MICHEL_JORDAN_LAST_DANCE_EPISODE1.watchId)
        }
    }
}