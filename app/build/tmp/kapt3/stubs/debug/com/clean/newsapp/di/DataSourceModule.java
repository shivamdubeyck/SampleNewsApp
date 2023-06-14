package com.clean.newsapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/clean/newsapp/di/DataSourceModule;", "", "bindLocalDataSource", "Lcom/clean/newsapp/data/local/datasource/LocalDataSource;", "localDataSourceImpl", "Lcom/clean/newsapp/data/local/datasource/LocalDataSourceImpl;", "bindRemoteDataSource", "Lcom/clean/newsapp/data/remote/datasource/RemoteDataSource;", "remoteDataSourceImpl", "Lcom/clean/newsapp/data/remote/datasource/RemoteDataSourceImpl;", "app_debug"})
@dagger.Module
public abstract interface DataSourceModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.clean.newsapp.data.local.datasource.LocalDataSource bindLocalDataSource(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.local.datasource.LocalDataSourceImpl localDataSourceImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.clean.newsapp.data.remote.datasource.RemoteDataSource bindRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.remote.datasource.RemoteDataSourceImpl remoteDataSourceImpl);
}