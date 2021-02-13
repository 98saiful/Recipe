package com.sazs.recipe.data.network

import com.sazs.recipe.data.RemoteDataSource
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
//    localDataSource: LocalDataSource
){
    val remote = remoteDataSource
}