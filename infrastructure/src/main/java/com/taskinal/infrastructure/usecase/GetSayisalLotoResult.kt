package com.taskinal.infrastructure.usecase

import com.taskinal.infrastructure.repository.SayisalRepository

/**
 * @project CleanLottery
 * @author alitaskin on 14.08.2021
 */
class GetSayisalLotoResult(private val sayisalRepository: SayisalRepository) {
    suspend operator fun invoke(number: String) = sayisalRepository.getSayisalResult()
}