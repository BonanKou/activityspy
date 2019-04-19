package edu.washington.koub2.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("onCreate", "onCreate event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart", "onStart event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause", "onPause event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart", "onRestart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume", "onRestart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop", "onStop event fired")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "We're going down, Captain!")
    }
}
