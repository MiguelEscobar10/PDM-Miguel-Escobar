package com.example.lab9.data.remote
import com.example.lab9.data.model.MealResponse
import retrofit2.http.GET

interface ApiService {

    @GET("search.php?s=")
    suspend fun getMeals(): MealResponse
}