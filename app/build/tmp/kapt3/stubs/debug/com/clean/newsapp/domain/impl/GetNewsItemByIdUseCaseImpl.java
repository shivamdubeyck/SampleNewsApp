package com.clean.newsapp.domain.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/clean/newsapp/domain/impl/GetNewsItemByIdUseCaseImpl;", "Lcom/clean/newsapp/domain/contract/GetNewsItemByIdUseCase;", "newsFeedRepository", "Lcom/clean/newsapp/data/repository/contract/NewsFeedRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/clean/newsapp/data/repository/contract/NewsFeedRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/clean/newsapp/common/ResultState;", "Lcom/clean/newsapp/data/model/NewsItem;", "newsItemId", "", "app_debug"})
public final class GetNewsItemByIdUseCaseImpl implements com.clean.newsapp.domain.contract.GetNewsItemByIdUseCase {
    private final com.clean.newsapp.data.repository.contract.NewsFeedRepository newsFeedRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject
    public GetNewsItemByIdUseCaseImpl(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.repository.contract.NewsFeedRepository newsFeedRepository, @org.jetbrains.annotations.NotNull
    @com.clean.newsapp.di.IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.clean.newsapp.common.ResultState<com.clean.newsapp.data.model.NewsItem>> invoke(int newsItemId) {
        return null;
    }
}