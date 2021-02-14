package com.sazs.recipe.data

import com.sazs.recipe.data.database.RecipesDao
import com.sazs.recipe.data.database.entities.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
){
    fun readRecipes(): Flow<List<RecipesEntity>> {
        return recipesDao.readRecipes()
    }

//    fun readFavoriteRecipes(): Flow<List<FavoritesEntity>> {
//        return recipesDao.readFavoriteRecipes()
//    }

    suspend fun insertRecipes(recipesEntity: RecipesEntity) {
        recipesDao.insertRecipes(recipesEntity)
    }

//    suspend fun insertFavoriteRecipes(favoritesEntity: FavoritesEntity) {
//        recipesDao.insertFavoriteRecipe(favoritesEntity)
//    }


//    suspend fun deleteFavoriteRecipe(favoritesEntity: FavoritesEntity) {
//        recipesDao.deleteFavoriteRecipe(favoritesEntity)
//    }

//    suspend fun deleteAllFavoriteRecipes() {
//        recipesDao.deleteAllFavoriteRecipes()
//    }
}