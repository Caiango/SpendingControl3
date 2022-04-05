package com.example.spendingcontrol3

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "spendings")
data class SpendingItem(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String?,
    val value: String?,
    val date: String?,
    val monthly: Boolean?,
    val paid: Boolean?,
)
