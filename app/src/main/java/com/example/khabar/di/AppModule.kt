package com.example.khabar.di

import android.app.Application
import com.example.khabar.data.LocalUserManagerImpl
import com.example.khabar.domain.manager.LocalUserManager
import com.example.khabar.domain.usecases.AppEntryUseCases
import com.example.khabar.domain.usecases.ReadAppEntry
import com.example.khabar.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}