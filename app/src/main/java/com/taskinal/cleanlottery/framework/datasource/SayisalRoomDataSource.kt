package com.taskinal.cleanlottery.framework.datasource

import com.taskinal.cleanlottery.framework.db.LotteryDao
import com.taskinal.domain.entity.SayisalLoto
import com.taskinal.infrastructure.data.local.SayisalLocalDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * @project CleanLottery
 * @author alitaskin on 14.08.2021
 */
class SayisalRoomDataSource @Inject constructor(
    private val dao: LotteryDao
) : SayisalLocalDataSource {

    override suspend fun save(obj: SayisalLoto) {
        TODO("Not yet implemented")
    }

    override fun get(): Flow<SayisalLoto> {
        TODO("Not yet implemented")
    }
}