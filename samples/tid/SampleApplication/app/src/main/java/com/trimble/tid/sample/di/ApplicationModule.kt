package com.trimble.tid.sample.di

import android.content.Context
import com.trimble.id.android.Authenticator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Provides
    @Singleton
    fun provideAuthenticator(@ApplicationContext context: Context)  = Authenticator(
        context = context,
        configurationEndpoint = "https://example/.well-known/openid-configuration",
        clientID = "clientID",
        redirectUri = "redirectUri",
        scope = "scope",
    )
}