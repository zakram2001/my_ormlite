package com.androidatc.myormliteexample

import android.app.Application

class App: Application() {
    companion object {
        lateinit var instance: App
    }
    init {
        instance = this
    }
}