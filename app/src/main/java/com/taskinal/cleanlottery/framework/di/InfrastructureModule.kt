package com.taskinal.cleanlottery.framework.di

import com.taskinal.cleanlottery.framework.datasource.SayisalRoomDataSource
import com.taskinal.cleanlottery.framework.network.LotteryService
import com.taskinal.infrastructure.repository.SayisalRepository
import com.taskinal.infrastructure.usecase.GetSayisalLotoResult
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @project CleanLottery
 * @author alitaskin on 14.08.2021
 */

@Module
@InstallIn(SingletonComponent::class)
class InfrastructureModule {


    @Provides
    fun provideSayisalRepository(
        localDataSource: SayisalRoomDataSource,
        remoteDataSource: LotteryService
    ) = SayisalRepository(localDataSource, remoteDataSource)

    @Provides
    fun provideGetSayisalLotoResultUseCase(sayisalRepository: SayisalRepository) =
        GetSayisalLotoResult(sayisalRepository)
}