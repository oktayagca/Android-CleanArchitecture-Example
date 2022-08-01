package com.example.data.remote.source

import com.example.data.entity.CharacterInfoResponse
import com.example.data.entity.CharacterResponse
import com.example.data.remote.ApiService
import com.example.data.remote.utils.DataState
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
):BaseRemoteDataSource() {

    suspend fun getAllCharacters(
        page: Int,
        options: Map<String, String>
    ):Flow<DataState<CharacterResponse>> = getResult {
        apiService.getAllCharacters(page,options)
    }

     suspend fun getCharacter(characterId: Int) =
        getResult { apiService.getCharacter(characterId = characterId) }
}