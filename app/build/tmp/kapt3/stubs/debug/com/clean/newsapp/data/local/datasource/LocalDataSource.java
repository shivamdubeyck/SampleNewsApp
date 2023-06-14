package com.clean.newsapp.data.local.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/clean/newsapp/data/local/datasource/LocalDataSource;", "", "getNewsFeed", "", "Lcom/clean/newsapp/data/local/entities/NewsItemEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsItemById", "newsItemId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCachedFeedAvailable", "", "saveNewsFeedLocally", "", "networkNewsItem", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LocalDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNewsFeed(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.clean.newsapp.data.local.entities.NewsItemEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveNewsFeedLocally(@org.jetbrains.annotations.NotNull
    java.util.List<com.clean.newsapp.data.local.entities.NewsItemEntity> networkNewsItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNewsItemById(int newsItemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.clean.newsapp.data.local.entities.NewsItemEntity> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object isCachedFeedAvailable(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}