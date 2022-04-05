package com.example.spendingcontrol3

import androidx.recyclerview.widget.DiffUtil


class ItemAdapter() {
}

private object ItemAdapterCallback : DiffUtil.ItemCallback<UserItem>() {
    override fun areItemsTheSame(oldItem: UserItem, newItem: UserItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: UserItem, newItem: UserItem) = oldItem == newItem
}