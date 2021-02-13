package com.sazs.recipe.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sazs.recipe.models.FoodRecipe
import com.sazs.recipe.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}