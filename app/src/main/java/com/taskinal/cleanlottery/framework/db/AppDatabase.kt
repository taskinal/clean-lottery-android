package com.taskinal.cleanlottery.framework.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

/**
 * @project CleanLottery
 * @author alitaskin on 14.08.2021
 */
@Database(entities = [SayisalLotoCache::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun lotteryDao(): LotteryDao
}