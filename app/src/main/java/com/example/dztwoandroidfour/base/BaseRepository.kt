package com.example.dztwoandroidfour.base

import androidx.lifecycle.liveData
import com.example.dztwoandroidfour.utils.Resource

abstract class BaseRepository {
    protected open fun <T> doRequest(request: suspend () -> T) = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(request()))
        } catch (ioException: Exception) {
            emit(Resource.Failure(null ,ioException.localizedMessage ?: "Error"))
        }
    }
}