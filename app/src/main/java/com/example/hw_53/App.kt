package com.example.hw_53

import android.app.Application
import androidx.room.Room
import db.AppDatabase

class App: Application() {

    erride fun onCreate() {
        super.onCreate()
        db= Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "database-name").allowMainThreadQueries()
            .build()
    }
    companion object{
        lateinit var db: AppDatabase
    }
}