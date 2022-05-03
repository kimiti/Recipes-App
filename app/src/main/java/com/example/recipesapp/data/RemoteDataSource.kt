package com.example.recipesapp.data

import com.example.recipesapp.data.network.FoodRecipesApi
import com.example.recipesapp.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>):Response<FoodRecipe> {
       return foodRecipesApi.getRecipes(queries)
    }
}