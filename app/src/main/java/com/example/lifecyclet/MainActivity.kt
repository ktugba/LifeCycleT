package com.example.lifecyclet

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Uygulama ilk çalıştığında ayağa kalktığında çalışan metod
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "onCreate".logError()

    }

    //onCreate metodundan sonra Activity başlatmak için çalışan metod
    override fun onStart() {
        super.onStart()

        "onStart".logError()
    }

    //Ekrana uygulamanın ui'yı geldiği zaman başlatılan metod
    override fun onResume() {
        super.onResume()

        "onResume".logError()
    }

    override fun onRestart() {
        super.onRestart()

        "onRestart".logError()
    }

    //uygulama arka plana alındığında çalışan metod
    override fun onPause() {
        super.onPause()

        "onPause".logError()
    }

    //Activity arka plana alndığında çalışır
    override fun onStop() {
        super.onStop()

        "onStop".logError()
    }

    //Activity tamamen yok edilmiştir.
    override fun onDestroy() {
        super.onDestroy()

        "onDestroy".logError()
    }

    override fun onContentChanged() {
        super.onContentChanged()

        "onContentChanged".logError()
    }

    //Geri tuşuna basıldığında çalışan metod
    override fun onBackPressed() {
        super.onBackPressed()

        "onBackPressed".logError()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        "onOptionsItemSelected".logError()
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        "onCreateOptionsMenu".logError()
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        "onPrepareOptionsMenu".logError()
        return super.onPrepareOptionsMenu(menu)
    }

    //onSaveInstanceState metodu tarafından kaydedilen verileri tekrar yazar
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        "onRestoreInstanceState".logError()
    }

    //Kaydedilmesi gereken veriler olduğunda çalışan metod
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        "onSaveInstanceState".logError()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        "onConfigurationChanged".logError()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        "onUserInteraction".logError()
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)

        "startActivityForResult".logError()
    }

}
