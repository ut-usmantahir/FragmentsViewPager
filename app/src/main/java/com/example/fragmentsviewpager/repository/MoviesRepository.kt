package com.example.fragmentsviewpager.repository

import com.example.fragmentsviewpager.network.MoviesApi
import com.example.fragmentsviewpager.network.SafeApiRequest

class MoviesRepository(
    private val api: MoviesApi
): SafeApiRequest(){

    suspend fun getMovies() = apiRequest {api.getMovies()}
}