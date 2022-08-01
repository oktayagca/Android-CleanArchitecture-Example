package com.example.data.remote

import com.example.data.entity.CharacterInfoResponse
import com.example.data.entity.CharacterResponse
import com.example.data.remote.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface ApiService {

    @GET(Constants.CHARACTER_LIST)
    suspend fun getAllCharacters(
        @Query(Constants.PARAM_PAGE) page: Int,
        @QueryMap options: Map<String, String>? = null
    ):Response<CharacterResponse>

    @GET(Constants.GET_CHARACTER)
    suspend fun getCharacter(
        @Path(Constants.PARAM_ID) characterId: Int
    ): Response<CharacterInfoResponse>
}