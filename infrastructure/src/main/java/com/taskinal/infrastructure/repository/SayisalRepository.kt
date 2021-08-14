package com.taskinal.infrastructure.repository

import com.taskinal.domain.entity.Resource
import com.taskinal.domain.entity.SayisalLoto
import com.taskinal.infrastructure.data.local.SayisalLocalDataSource
import com.taskinal.infrastructure.data.remote.SayisalRemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * @project CleanLottery
 * @author alitaskin on 13.08.2021
 */
class SayisalRepository(
    private val localDataSource: SayisalLocalDataSource,
    private val remoteDataSource: SayisalRemoteDataSource
) {

    /**
     * For now 1st draft
     */
    suspend fun getSayisalResult() : Flow<Resource<SayisalLoto>>{

        val result = localDataSource.get().map {
            Resource.success(it)
        }
        localDataSource.save(remoteDataSource.get().data!!)
        return result
    }

}