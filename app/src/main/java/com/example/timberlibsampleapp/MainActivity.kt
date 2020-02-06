package com.example.timberlibsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Timber log for debug purpose
        //No need to give tag name by default it will take class name
        Timber.d("onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart()")
    }

    override fun onResume() {
        super.onResume()
        Timber.e("onResume()")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.v("onRestart()")
    }

    override fun onStop() {
        super.onStop()
        Timber.w("onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        //Specify the tag explicitly here
        Timber.tag(TAG).d("onDestroy()")
    }
}
