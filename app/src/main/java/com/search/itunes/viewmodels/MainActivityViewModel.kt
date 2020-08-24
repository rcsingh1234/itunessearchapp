package com.search.itunes.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.search.itunes.apis.ApisRepository
import com.search.itunes.models.Result

class MainActivityViewModel: ViewModel() {

    fun getiTunes(term: String): LiveData<List<Result>>? {
        return ApisRepository.getiTunes(term)
    }
}