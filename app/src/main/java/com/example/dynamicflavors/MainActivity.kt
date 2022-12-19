package com.example.dynamicflavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvAppName).text = getString(R.string.app_name)
        findViewById<TextView>(R.id.tvAppVersionCode).text = BuildConfig.VERSION_CODE.toString()
        findViewById<TextView>(R.id.tvAppVersionName).text = BuildConfig.VERSION_NAME
        findViewById<TextView>(R.id.tvAppId).text = BuildConfig.APPLICATION_ID
    }
}