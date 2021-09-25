package com.oddlycoder.cryptocur.domain.repository

import com.oddlycoder.cryptocur.data.remote.dto.CoinDetailDto
import com.oddlycoder.cryptocur.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}