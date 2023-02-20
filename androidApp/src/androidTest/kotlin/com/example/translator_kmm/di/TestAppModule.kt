package com.example.translator_kmm.di

import com.example.translator_kmm.translate.data.remote.FakeTranslateClient
import com.example.translator_kmm.translate.domain.translate.TranslateClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {


    @Provides
    @Singleton
    fun provideFakeTranslateClient():TranslateClient{
        return FakeTranslateClient()
    }



    @Provides
    @Singleton
    fun provideFakeTranslateClient():TranslateClient{
        return FakeTranslateClient()
    }
}