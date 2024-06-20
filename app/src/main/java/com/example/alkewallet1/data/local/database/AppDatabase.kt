package com.example.alkewallet1.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.alkewallet1.data.local.dao.UserDAO
import com.example.alkewallet1.data.model.User

@Database(entities = [User::class],
    version = 1, exportSchema = false)

abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDAO

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "Alke_database"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}

