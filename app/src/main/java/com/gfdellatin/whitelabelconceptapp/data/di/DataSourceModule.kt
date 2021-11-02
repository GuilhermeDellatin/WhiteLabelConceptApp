package com.gfdellatin.whitelabelconceptapp.data.di

import com.gfdellatin.whitelabelconceptapp.data.FirebaseProductDataSource
import com.gfdellatin.whitelabelconceptapp.data.ProductDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Singleton
    @Binds
    fun bindProductDataSource(dataSource: FirebaseProductDataSource): ProductDataSource

}