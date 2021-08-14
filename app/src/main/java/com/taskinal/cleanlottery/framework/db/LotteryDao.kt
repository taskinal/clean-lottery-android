package com.taskinal.cleanlottery.framework.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * @project CleanLottery
 * @author alitaskin on 13.08.2021
 */
@Dao
interface LotteryDao {

    @Query("SELECT * FROM SayisalLotoCache WHERE number = :number")
    fun select(number: String): Flow<SayisalLotoCache?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(vararg lottery: SayisalLotoCache)
}