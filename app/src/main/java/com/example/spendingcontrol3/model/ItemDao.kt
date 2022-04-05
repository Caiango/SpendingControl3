package com.example.spendingcontrol3.model

import androidx.room.*
import com.example.spendingcontrol3.UserItem

@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(gainItem: UserItem)

    @Delete
    suspend fun deleteItem(gainItem: UserItem)

    @Query("SELECT * FROM user_item WHERE type = :type")
    suspend fun getAllGains(type: String): List<UserItem>

    @Query("SELECT * FROM user_item WHERE type = :type")
    suspend fun getAllSpends(type: String): List<UserItem>

    @Query("DELETE FROM user_item WHERE type = :type")
    suspend fun deleteAllGains(type: String)

    @Query("DELETE FROM user_item WHERE type = :type")
    suspend fun deleteAllSpendings(type: String)
}