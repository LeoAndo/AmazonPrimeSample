package com.leoleo2.amazonprimesample

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.Intent.*
import android.net.Uri
import android.widget.Toast

class AppLaunchHelper(private val context: Context) {

    /**
     * example
     * https://www.amazon.co.jp/gp/video/detail/B09PQB418P
     */
    fun launchAmazonPrimeApp(uriString: String) {
        kotlin.runCatching {
            Intent().apply {
                action = ACTION_VIEW
                data = Uri.parse(uriString)
                addFlags(FLAG_ACTIVITY_NEW_TASK)
            }.let {
                context.startActivity(it)
            }
        }.onFailure {
            when (it) {
                is ActivityNotFoundException -> {
                    val message = it.localizedMessage ?: "launch app error."
                    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}