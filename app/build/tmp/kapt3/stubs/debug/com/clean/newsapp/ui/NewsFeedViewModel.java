package com.clean.newsapp.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/clean/newsapp/ui/NewsFeedViewModel;", "Landroidx/lifecycle/ViewModel;", "getNewsFeedUseCase", "Lcom/clean/newsapp/domain/contract/GetNewsFeedUseCase;", "getNewsItemByIdUseCase", "Lcom/clean/newsapp/domain/contract/GetNewsItemByIdUseCase;", "(Lcom/clean/newsapp/domain/contract/GetNewsFeedUseCase;Lcom/clean/newsapp/domain/contract/GetNewsItemByIdUseCase;)V", "_newsDetailScreenMutableState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/clean/newsapp/ui/detail/state/NewsDetailScreenState;", "_newsFeedScreenMutableState", "Lcom/clean/newsapp/ui/feed/state/NewsFeedScreenState;", "newsDetailScreenState", "Lkotlinx/coroutines/flow/StateFlow;", "getNewsDetailScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "newsFeedScreenState", "getNewsFeedScreenState", "fetchNewsFeed", "", "getNewsItemById", "newsItemId", "", "app_debug"})
public final class NewsFeedViewModel extends androidx.lifecycle.ViewModel {
    private final com.clean.newsapp.domain.contract.GetNewsFeedUseCase getNewsFeedUseCase = null;
    private final com.clean.newsapp.domain.contract.GetNewsItemByIdUseCase getNewsItemByIdUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.clean.newsapp.ui.feed.state.NewsFeedScreenState> _newsFeedScreenMutableState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.clean.newsapp.ui.feed.state.NewsFeedScreenState> newsFeedScreenState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.clean.newsapp.ui.detail.state.NewsDetailScreenState> _newsDetailScreenMutableState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.clean.newsapp.ui.detail.state.NewsDetailScreenState> newsDetailScreenState = null;
    
    @javax.inject.Inject
    public NewsFeedViewModel(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.domain.contract.GetNewsFeedUseCase getNewsFeedUseCase, @org.jetbrains.annotations.NotNull
    com.clean.newsapp.domain.contract.GetNewsItemByIdUseCase getNewsItemByIdUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.clean.newsapp.ui.feed.state.NewsFeedScreenState> getNewsFeedScreenState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.clean.newsapp.ui.detail.state.NewsDetailScreenState> getNewsDetailScreenState() {
        return null;
    }
    
    /**
     * *
     *   Fetches the News Feed from Remote/Local datasource
     *   Based on network status
     */
    public final void fetchNewsFeed() {
    }
    
    /**
     * *
     *   Fetches the News Item by Id from Local datasource
     */
    public final void getNewsItemById(int newsItemId) {
    }
}