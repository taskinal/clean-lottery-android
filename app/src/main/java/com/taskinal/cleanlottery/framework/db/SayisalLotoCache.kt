package com.taskinal.cleanlottery.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * @project CleanLottery
 * @author alitaskin on 13.08.2021
 */

@Entity(primaryKeys = ["number"])
data class SayisalLotoCache(
    @ColumnInfo(name = "number") val lotteryNumber: String,
    @ColumnInfo(name = "winning_number") val winningNumber: ArrayList<String>,
    @ColumnInfo(name = "numberJolly") val numberJolly: String
)
