package com.clean.newsapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/clean/newsapp/di/UseCaseModule;", "", "()V", "getNewsFeedUseCase", "Lcom/clean/newsapp/domain/contract/GetNewsFeedUseCase;", "newsFeedRepository", "Lcom/clean/newsapp/data/repository/contract/NewsFeedRepository;", "networkStatusUtil", "Lcom/clean/newsapp/util/NetworkStatusUtil;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getNewsItemByIdUseCase", "Lcom/clean/newsapp/domain/contract/GetNewsItemByIdUseCase;", "app_debug"})
@dagger.Module
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.clean.newsapp.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.clean.newsapp.domain.contract.GetNewsFeedUseCase getNewsFeedUseCase(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.repository.contract.NewsFeedRepository newsFeedRepository, @org.jetbrains.annotations.NotNull
    com.clean.newsapp.util.NetworkStatusUtil networkStatusUtil, @org.jetbrains.annotations.NotNull
    @IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.clean.newsapp.domain.contract.GetNewsItemByIdUseCase getNewsItemByIdUseCase(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.repository.contract.NewsFeedRepository newsFeedRepository, @org.jetbrains.annotations.NotNull
    @IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return null;
    }
}