package com.taskinal.infrastructure.data.local

import com.taskinal.domain.entity.SayisalLoto
import kotlinx.coroutines.flow.Flow

/**
 * @project CleanLottery
 * @author alitaskin on 13.08.2021
 */
interface SayisalLocalDataSource {

    suspend fun save(obj: SayisalLoto)

    fun get(): Flow<SayisalLoto>
}