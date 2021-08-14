package com.taskinal.cleanlottery.framework.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.taskinal.cleanlottery.framework.network.LotteryService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

/**
 * @project CleanLottery
 * @author alitaskin on 14.08.2021
 */

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class HeaderInterceptorOkHttpClient

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    companion object {
        private const val SERVICE_URL: String = "https://www.millipiyangoonline.com/sisalsans/"
    }

    @Provides
    fun provideLotteryService(
        gson: Gson,
        @HeaderInterceptorOkHttpClient okHttpClient: OkHttpClient
    ): LotteryService {
        return Retrofit.Builder()
            .baseUrl(SERVICE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)
            .build()
            .create(LotteryService::class.java)
    }

    @Provides
    @Singleton
    fun provideGson(): Gson = GsonBuilder().create()

    @HeaderInterceptorOkHttpClient
    @Provides
    @Singleton
    fun provideHeaderInterceptorOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun providesLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

}