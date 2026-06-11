package com.example.labtemplate

import android.app.Application
import androidx.room.Room
import com.example.labtemplate.data.AppDatabase

class InitDatabase : Application() {

    companion object {
        lateinit var database: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "task_database"
        ).build()
    }
}