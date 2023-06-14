package com.clean.newsapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/clean/newsapp/di/RepositoryModule;", "", "()V", "provideNewsFeedRepository", "Lcom/clean/newsapp/data/repository/contract/NewsFeedRepository;", "remoteDataSource", "Lcom/clean/newsapp/data/remote/datasource/RemoteDataSource;", "localDataSource", "Lcom/clean/newsapp/data/local/datasource/LocalDataSource;", "app_debug"})
@dagger.Module
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.clean.newsapp.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.scopes.ViewModelScoped
    @dagger.Provides
    public final com.clean.newsapp.data.repository.contract.NewsFeedRepository provideNewsFeedRepository(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.remote.datasource.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.local.datasource.LocalDataSource localDataSource) {
        return null;
    }
}