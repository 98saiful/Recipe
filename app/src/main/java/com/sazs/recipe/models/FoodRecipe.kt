package com.sazs.recipe.models

import com.google.gson.annotations.SerializedName
import com.sazs.recipe.models.Result

data class FoodRecipe(
    @SerializedName("results")
    val results: List<Result>
)