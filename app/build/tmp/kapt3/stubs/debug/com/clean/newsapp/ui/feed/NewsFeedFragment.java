package com.clean.newsapp.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010 \u001a\u00020\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\'H\u0002J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u001aH\u0016J\u001a\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00103\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00064"}, d2 = {"Lcom/clean/newsapp/ui/feed/NewsFeedFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/clean/newsapp/databinding/FragmentNewsFeedBinding;", "binding", "getBinding", "()Lcom/clean/newsapp/databinding/FragmentNewsFeedBinding;", "dateTimeUtil", "Lcom/clean/newsapp/util/DateTimeUtil;", "getDateTimeUtil", "()Lcom/clean/newsapp/util/DateTimeUtil;", "setDateTimeUtil", "(Lcom/clean/newsapp/util/DateTimeUtil;)V", "newsFeedViewModel", "Lcom/clean/newsapp/ui/NewsFeedViewModel;", "getNewsFeedViewModel", "()Lcom/clean/newsapp/ui/NewsFeedViewModel;", "newsFeedViewModel$delegate", "Lkotlin/Lazy;", "newsListAdapter", "Lcom/clean/newsapp/ui/adapter/NewsListAdapter;", "getNewsListAdapter", "()Lcom/clean/newsapp/ui/adapter/NewsListAdapter;", "newsListAdapter$delegate", "handleErrorState", "", "errorMessage", "", "handleLoadingState", "loading", "", "handleNewsFeed", "newsList", "", "Lcom/clean/newsapp/data/model/NewsItem;", "hideRetryView", "navigateToNewsDetailScreen", "newsItemId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setUpRetryView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class NewsFeedFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject
    public com.clean.newsapp.util.DateTimeUtil dateTimeUtil;
    private com.clean.newsapp.databinding.FragmentNewsFeedBinding _binding;
    private final kotlin.Lazy newsFeedViewModel$delegate = null;
    private final kotlin.Lazy newsListAdapter$delegate = null;
    
    public NewsFeedFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.clean.newsapp.util.DateTimeUtil getDateTimeUtil() {
        return null;
    }
    
    public final void setDateTimeUtil(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.util.DateTimeUtil p0) {
    }
    
    private final com.clean.newsapp.databinding.FragmentNewsFeedBinding getBinding() {
        return null;
    }
    
    private final com.clean.newsapp.ui.NewsFeedViewModel getNewsFeedViewModel() {
        return null;
    }
    
    private final com.clean.newsapp.ui.adapter.NewsListAdapter getNewsListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleErrorState(java.lang.String errorMessage) {
    }
    
    private final void hideRetryView() {
    }
    
    private final void setUpRetryView() {
    }
    
    private final void handleNewsFeed(java.util.List<com.clean.newsapp.data.model.NewsItem> newsList) {
    }
    
    private final void navigateToNewsDetailScreen(int newsItemId) {
    }
    
    private final void handleLoadingState(boolean loading) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}