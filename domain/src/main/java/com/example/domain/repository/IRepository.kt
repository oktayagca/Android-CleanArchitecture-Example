package com.example.domain.repository

import com.example.data.entity.CharacterInfoResponse
import com.example.data.entity.CharacterResponse
import com.example.data.remote.utils.DataState
import kotlinx.coroutines.flow.Flow

interface IRepository {
    fun getAllCharacters(page: Int, options: Map<String, String>): Flow<DataState<CharacterResponse>>
    fun getCharacter(characterId: Int): Flow<DataState<CharacterInfoResponse>>
}