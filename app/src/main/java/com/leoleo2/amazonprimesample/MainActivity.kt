package com.leoleo2.amazonprimesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appLaunchHelper = AppLaunchHelper(this)
        findViewById<View>(R.id.buttonHome).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.HOME.uriString)
        }
        findViewById<View>(R.id.buttonDownload).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.DOWNLOAD.uriString)
        }
        findViewById<View>(R.id.buttonWatchList).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.WATCH_LIST.uriString)
        }
        findViewById<View>(R.id.buttonWatchListV2).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.WATCH_LIST_V2.uriString)
        }
        findViewById<View>(R.id.buttonDetail).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.DETAIL.uriString)
        }
        findViewById<View>(R.id.buttonLibrary).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.LIBRARY.uriString)
        }
        findViewById<View>(R.id.buttonFollowingSelection).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.FOLLOWING_SELECTION.uriString)
        }
        findViewById<View>(R.id.buttonCantilever).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.CANTILEVER.uriString)
        }
        findViewById<View>(R.id.buttonComingSoon).setOnClickListener {
            appLaunchHelper.launchAmazonPrimeApp(SceneData.COMINGSOON.uriString)
        }
    }
}