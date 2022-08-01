package com.example.data.repository

import com.example.data.entity.CharacterInfoResponse
import com.example.data.entity.CharacterResponse
import com.example.data.remote.source.RemoteDataSource
import com.example.data.remote.utils.DataState
import com.example.domain.repository.IRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RepositoryImplementation @Inject constructor(
    private val remoteDataSource: RemoteDataSource
): IRepository {

    override fun getAllCharacters(
        page: Int,
        options: Map<String, String>
    ): Flow<DataState<CharacterResponse>>  = flow{
        emitAll(remoteDataSource.getAllCharacters(page,options))
    }

    override fun getCharacter(characterId: Int): Flow<DataState<CharacterInfoResponse>> = flow {
      emitAll(remoteDataSource.getCharacter(characterId))
    }
}