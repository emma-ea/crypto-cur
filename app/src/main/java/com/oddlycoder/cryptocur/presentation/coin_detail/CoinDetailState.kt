package com.oddlycoder.cryptocur.presentation.coin_detail

import com.oddlycoder.cryptocur.domain.model.Coin
import com.oddlycoder.cryptocur.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
