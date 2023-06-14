package com.clean.newsapp.data.repository.contract;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/clean/newsapp/data/repository/contract/NewsFeedRepository;", "", "fetchNewsFeedLocal", "", "Lcom/clean/newsapp/data/model/NewsItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNewsFeedRemote", "Lcom/clean/newsapp/data/remote/model/NetworkNewsItem;", "getNewsItemById", "Lcom/clean/newsapp/data/local/entities/NewsItemEntity;", "newsItemId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newsFeedCacheAvailable", "", "saveNewsFeedInCache", "", "newsFeed", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsFeedRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchNewsFeedRemote(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.clean.newsapp.data.remote.model.NetworkNewsItem>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchNewsFeedLocal(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.clean.newsapp.data.model.NewsItem>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveNewsFeedInCache(@org.jetbrains.annotations.NotNull
    java.util.List<com.clean.newsapp.data.remote.model.NetworkNewsItem> newsFeed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNewsItemById(int newsItemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.clean.newsapp.data.local.entities.NewsItemEntity> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object newsFeedCacheAvailable(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}