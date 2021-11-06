package com.gfdellatin.whitelabelconceptapp.config.di

import com.gfdellatin.whitelabelconceptapp.config.Config
import com.gfdellatin.whitelabelconceptapp.config.ConfigImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface ConfigModule {

    @Binds
    fun bindConfig(config: ConfigImpl): Config
}