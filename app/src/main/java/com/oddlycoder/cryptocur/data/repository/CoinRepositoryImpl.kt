package com.oddlycoder.cryptocur.data.repository

import com.oddlycoder.cryptocur.data.remote.CoinPaprikaApi
import com.oddlycoder.cryptocur.data.remote.dto.CoinDetailDto
import com.oddlycoder.cryptocur.data.remote.dto.CoinDto
import com.oddlycoder.cryptocur.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinPaprikaApi) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}