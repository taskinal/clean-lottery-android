package com.taskinal.cleanlottery.framework.di

import android.content.Context
import androidx.room.Room
import com.taskinal.cleanlottery.framework.db.AppDatabase
import com.taskinal.cleanlottery.framework.db.LotteryDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @project CleanLottery
 * @author alitaskin on 14.08.2021
 */

@InstallIn(SingletonComponent::class)
@Module
class DbModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "Lottery"
        ).build()
    }

    @Provides
    fun provideLotteryDao(appDatabase: AppDatabase): LotteryDao {
        return appDatabase.lotteryDao()
    }

}