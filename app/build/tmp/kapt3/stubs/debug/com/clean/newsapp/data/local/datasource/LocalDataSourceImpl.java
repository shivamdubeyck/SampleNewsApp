package com.clean.newsapp.data.local.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/clean/newsapp/data/local/datasource/LocalDataSourceImpl;", "Lcom/clean/newsapp/data/local/datasource/LocalDataSource;", "newsDao", "Lcom/clean/newsapp/data/local/db/NewsDao;", "(Lcom/clean/newsapp/data/local/db/NewsDao;)V", "getNewsFeed", "", "Lcom/clean/newsapp/data/local/entities/NewsItemEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsItemById", "newsItemId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCachedFeedAvailable", "", "saveNewsFeedLocally", "", "networkNewsItem", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocalDataSourceImpl implements com.clean.newsapp.data.local.datasource.LocalDataSource {
    private final com.clean.newsapp.data.local.db.NewsDao newsDao = null;
    
    @javax.inject.Inject
    public LocalDataSourceImpl(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.data.local.db.NewsDao newsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsFeed(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.clean.newsapp.data.local.entities.NewsItemEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveNewsFeedLocally(@org.jetbrains.annotations.NotNull
    java.util.List<com.clean.newsapp.data.local.entities.NewsItemEntity> networkNewsItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsItemById(int newsItemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.clean.newsapp.data.local.entities.NewsItemEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object isCachedFeedAvailable(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}