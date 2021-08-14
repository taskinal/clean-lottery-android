package com.taskinal.cleanlottery.framework.network

import com.taskinal.domain.entity.SayisalLoto
import com.taskinal.infrastructure.data.remote.SayisalRemoteDataSource
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @project CleanLottery
 * @author alitaskin on 13.08.2021
 */
interface LotteryService: SayisalRemoteDataSource {

    @GET("{query}")
    suspend fun getSayisalResult(@Path("query") number: String): Response<SayisalLoto>

}