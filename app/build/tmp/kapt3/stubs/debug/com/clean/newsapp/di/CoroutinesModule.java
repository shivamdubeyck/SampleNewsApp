package com.clean.newsapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/clean/newsapp/di/CoroutinesModule;", "", "()V", "providesIoDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesMainDispatcher", "app_debug"})
@dagger.Module
public final class CoroutinesModule {
    @org.jetbrains.annotations.NotNull
    public static final com.clean.newsapp.di.CoroutinesModule INSTANCE = null;
    
    private CoroutinesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @IoDispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher providesIoDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @MainDispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher providesMainDispatcher() {
        return null;
    }
}