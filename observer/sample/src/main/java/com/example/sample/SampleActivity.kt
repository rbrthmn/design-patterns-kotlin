package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sample.ui.main.SampleFragment

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SampleFragment.newInstance())
                .commitNow()
        }
    }
}