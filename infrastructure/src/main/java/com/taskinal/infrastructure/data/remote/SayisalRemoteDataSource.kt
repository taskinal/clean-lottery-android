package com.taskinal.infrastructure.data.remote

import com.taskinal.domain.entity.Resource
import com.taskinal.domain.entity.SayisalLoto

/**
 * @project CleanLottery
 * @author alitaskin on 13.08.2021
 */
interface SayisalRemoteDataSource {

    suspend fun get(): Resource<SayisalLoto>
}