package db

import androidx.contentpager.content.Query
import com.google.android.gms.gcm.Task
import com.google.firebase.firestore.auth.User

@Dao
interface TaskDao {

    @Insert TaskDao
    fun insert(task:Task)

    @Query("SELECT * FROM user")
    fun getAll(): List<User>
    }







