package com.clean.newsapp.domain.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\rH\u0096\u0002J\u001f\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/clean/newsapp/domain/impl/GetNewsFeedUseCaseImpl;", "Lcom/clean/newsapp/domain/contract/GetNewsFeedUseCase;", "newsFeedRepository", "Lcom/clean/newsapp/data/repository/contract/NewsFeedRepository;", "networkStatusUtil", "Lcom/clean/newsapp/util/NetworkStatusUtil;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/clean/newsapp/data/repository/contract/NewsFeedRepository;Lcom/clean/newsapp/util/NetworkStatusUtil;Lkotlinx/coroutines/CoroutineDispatcher;)V", "fetchFromCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/clean/newsapp/common/ResultState;", "", "Lcom/clean/newsapp/data/model/NewsItem;", "updateLocalNewsFeed", "", "newsFeedRemote", "Lcom/clean/newsapp/data/remote/model/NetworkNewsItem;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetNewsFeedUseCaseImpl implements com.clean.newsapp.domain.contract.GetNewsFeedUseCase {
    private final com.clean.newsapp.data.repository.contract.NewsFeedRepository newsFeedRepository = null;
    private final com.clean.newsapp.util.NetworkStatusUtil networkStatusUtil = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject
    public GetNewsFeedUseCaseImpl(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.repository.contract.NewsFeedRepository newsFeedRepository, @org.jetbrains.annotations.NotNull
    com.clean.newsapp.util.NetworkStatusUtil networkStatusUtil, @org.jetbrains.annotations.NotNull
    @com.clean.newsapp.di.IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    /**
     * *
     *  Internet --> Fetches news feed from Network if internet is available
     *               Caches the results in database
     *               returns the news feed
     *  No Internet --> Return News Feed from Cache
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.clean.newsapp.common.ResultState<java.util.List<com.clean.newsapp.data.model.NewsItem>>> invoke() {
        return null;
    }
    
    private final java.lang.Object updateLocalNewsFeed(java.util.List<com.clean.newsapp.data.remote.model.NetworkNewsItem> newsFeedRemote, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * *
     *   Checks if internet is available and cached news feed is cached
     */
    private final java.lang.Object fetchFromCache(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}