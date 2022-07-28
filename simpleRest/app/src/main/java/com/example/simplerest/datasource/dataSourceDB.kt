package com.example.simplerest.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.simplerest.model.User
import com.example.simplerest.model.UserDao


@Database(entities = [User::class], version = 1)
abstract class dataSourceDB : RoomDatabase() {

    abstract fun userDao():UserDao
}