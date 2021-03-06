package com.mobileforce.hometeach.data.sources.local.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.mobileforce.hometeach.data.model.UserEntity

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUser(user: UserEntity)

    @Query("SELECT * FROM user")
    fun getUser(): LiveData<UserEntity>

    @Delete
    fun deleteUser(user: UserEntity)

    @Query("DELETE FROM user")
    suspend fun clearDb()

    @Query("SELECT * FROM user")
    suspend fun getSingleUser(): UserEntity

}