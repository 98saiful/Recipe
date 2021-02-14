package com.sazs.recipe.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sazs.recipe.models.Result
import com.sazs.recipe.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)