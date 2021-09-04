package com.fin.pipelinandrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "99c0a88d-577b-413d-8d94-3fd26a139a5b",
            Analytics::class.java, Crashes::class.java
        )
    }

    override fun onResume() {
       super.onResume()
    }

}
