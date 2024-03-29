package com.marciotrindade.pagingall.di

import com.marciotrindade.pagingall.api.UnsplashApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
object AppModuleService {
    @Provides
    @Singleton
    fun providerRetrofit():Retrofit=
        Retrofit.Builder()
            .baseUrl(UnsplashApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    @Provides
    @Singleton
    fun provideUnsplashApi(retrofit: Retrofit): UnsplashApi =
        retrofit.create(UnsplashApi::class.java)
}