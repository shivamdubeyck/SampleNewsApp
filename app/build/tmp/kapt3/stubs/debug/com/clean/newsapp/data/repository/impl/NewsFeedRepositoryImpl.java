package com.clean.newsapp.data.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/clean/newsapp/data/repository/impl/NewsFeedRepositoryImpl;", "Lcom/clean/newsapp/data/repository/contract/NewsFeedRepository;", "remoteDataSource", "Lcom/clean/newsapp/data/remote/datasource/RemoteDataSource;", "localDataSource", "Lcom/clean/newsapp/data/local/datasource/LocalDataSource;", "(Lcom/clean/newsapp/data/remote/datasource/RemoteDataSource;Lcom/clean/newsapp/data/local/datasource/LocalDataSource;)V", "fetchNewsFeedLocal", "", "Lcom/clean/newsapp/data/model/NewsItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNewsFeedRemote", "Lcom/clean/newsapp/data/remote/model/NetworkNewsItem;", "getNewsItemById", "Lcom/clean/newsapp/data/local/entities/NewsItemEntity;", "newsItemId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newsFeedCacheAvailable", "", "saveNewsFeedInCache", "", "newsFeed", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsFeedRepositoryImpl implements com.clean.newsapp.data.repository.contract.NewsFeedRepository {
    private final com.clean.newsapp.data.remote.datasource.RemoteDataSource remoteDataSource = null;
    private final com.clean.newsapp.data.local.datasource.LocalDataSource localDataSource = null;
    
    @javax.inject.Inject
    public NewsFeedRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.remote.datasource.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.local.datasource.LocalDataSource localDataSource) {
        super();
    }
    
    /**
     * *
     *   Fetches News Feed from Remote
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object fetchNewsFeedRemote(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.clean.newsapp.data.remote.model.NetworkNewsItem>> continuation) {
        return null;
    }
    
    /**
     * *
     *   Fetches News Feed from Local Database
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object fetchNewsFeedLocal(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.clean.newsapp.data.model.NewsItem>> continuation) {
        return null;
    }
    
    /**
     * *
     *   Save news feed in database via Upsert
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveNewsFeedInCache(@org.jetbrains.annotations.NotNull
    java.util.List<com.clean.newsapp.data.remote.model.NetworkNewsItem> newsFeed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * *
     *   Returns news item via id from database
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsItemById(int newsItemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.clean.newsapp.data.local.entities.NewsItemEntity> continuation) {
        return null;
    }
    
    /**
     * *
     *   Checks if cached feed is available locally
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object newsFeedCacheAvailable(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}