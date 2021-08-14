package com.taskinal.domain.entity

import com.google.gson.annotations.SerializedName

/**
 * @project CleanLottery
 * @author alitaskin on 12.08.2021
 */
data class SayisalLoto(
    @SerializedName("number") val number: String,
    @SerializedName("dateDetails") val dateDetails: String,
    @SerializedName("timeDetails") val timeDetails: String,
    @SerializedName("winningNumber") val winningNumber: ArrayList<String>,
    @SerializedName("numberJolly") val numberJolly: ArrayList<String>,
    @SerializedName("jackpot") val jackpot: String
)
