package db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.google.android.gms.gcm.Task

class AppDatabase {
    @Database(entities = [Task::class], version = 1)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun taskDao(): TaskDao
}