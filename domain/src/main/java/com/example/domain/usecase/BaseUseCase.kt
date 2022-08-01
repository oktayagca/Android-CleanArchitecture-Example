package com.example.domain.usecase

import com.example.data.entity.CharacterResponse
import com.example.data.remote.utils.DataState
import kotlinx.coroutines.flow.*
import java.net.CacheRequest

/*
abstract class BaseFlowUseCase<in In, Out> {
    abstract fun execute(request: In): Flow<Resource<Out>>

    open fun invoke(request: In) = execute(request)
        .onStart {
            emit(Resource.Loading(true))
        }.onCompletion {
            emit(Resource.Loading(false))
        }
        .catch { t ->
            emit(Resource.Error(error = t))
        }
}

 */

abstract class BaseFLowUseCase {

    fun <T,E> invoke(
        callFlow: Flow<DataState<T>>,
        successState: () -> DataState.Success<E>,
        loadingState: () -> DataState.Loading<E>,
        errorState: () -> DataState.Error<E>
    ): Flow<DataState<E>> = flow {
        callFlow.collect { dataState ->
            when (dataState) {
                is DataState.Error -> {
                   errorState()
                }
                is DataState.Success -> {
                    emit(successState())
                }
                is DataState.Loading -> {
                    loadingState()
                }
            }
        }
    }

}

