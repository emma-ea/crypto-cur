package com.oddlycoder.cryptocur.presentation.coin_list

import com.oddlycoder.cryptocur.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
