package com.example.spendingcontrol3

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_item")
data class UserItem(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String?,
    val value: String?,
    val date: String?,
    val monthly: Boolean?,
    val paid: Boolean?,
    val type: String?,
)