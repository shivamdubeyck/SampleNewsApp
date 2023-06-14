package com.clean.newsapp.domain.contract;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6\u0002\u00a8\u0006\b"}, d2 = {"Lcom/clean/newsapp/domain/contract/GetNewsItemByIdUseCase;", "", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/clean/newsapp/common/ResultState;", "Lcom/clean/newsapp/data/model/NewsItem;", "newsItemId", "", "app_debug"})
public abstract interface GetNewsItemByIdUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.clean.newsapp.common.ResultState<com.clean.newsapp.data.model.NewsItem>> invoke(int newsItemId);
}