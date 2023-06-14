package com.clean.newsapp.data.local.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0011\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/clean/newsapp/data/local/db/NewsDao;", "", "getNewsFeed", "", "Lcom/clean/newsapp/data/local/entities/NewsItemEntity;", "getNewsItemById", "id", "", "isCachedFeedAvailable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertNewsFeed", "", "entities", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM newsItem")
    public abstract java.util.List<com.clean.newsapp.data.local.entities.NewsItemEntity> getNewsFeed();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM newsItem where id=:id")
    public abstract com.clean.newsapp.data.local.entities.NewsItemEntity getNewsItemById(int id);
    
    /**
     * Inserts or updates [entities] in the db under the specified primary keys
     * Source - https://github.com/android/nowinandroid/blob/7e6cb46436abd4895d2e11ff2eb6478cb9cca4dc/core/database/src/main/java/com/google/samples/apps/nowinandroid/core/database/dao/TopicDao.kt#L64
     */
    @org.jetbrains.annotations.Nullable
    @androidx.room.Upsert
    public abstract java.lang.Object upsertNewsFeed(@org.jetbrains.annotations.NotNull
    java.util.List<com.clean.newsapp.data.local.entities.NewsItemEntity> entities, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * *
     *  Fun to check if cached data is available before accessing
     */
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT (SELECT COUNT(*) FROM newsItem) != 0")
    public abstract java.lang.Object isCachedFeedAvailable(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}