package com.google.android.gms.samples.vision.ocrreader.OCRPack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.google.android.gms.samples.vision.ocrreader.MainActivity
import com.google.android.gms.samples.vision.ocrreader.R
import kotlinx.android.synthetic.main.activity_welcome_screen.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class WelcomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_welcome_screen)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Handler().postDelayed({ // This method will be executed once the timer is over
            val i = Intent(this@WelcomeScreen, MainActivity::class.java)
            startActivity(i)
            finish()
        },2000)
    }
}
