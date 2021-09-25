package com.oddlycoder.cryptocur.presentation.coin_list

import androidx.lifecycle.ViewModel
import com.oddlycoder.cryptocur.domain.use_cases.get_coin.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinUseCase: GetCoinUseCase
) : ViewModel() {
}