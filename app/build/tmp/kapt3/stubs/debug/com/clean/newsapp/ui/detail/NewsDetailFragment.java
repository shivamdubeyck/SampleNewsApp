package com.clean.newsapp.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016J\u001a\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/clean/newsapp/ui/detail/NewsDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/clean/newsapp/databinding/FragmentNewsDetailBinding;", "args", "Lcom/clean/newsapp/ui/detail/NewsDetailFragmentArgs;", "getArgs", "()Lcom/clean/newsapp/ui/detail/NewsDetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/clean/newsapp/databinding/FragmentNewsDetailBinding;", "newsFeedViewModel", "Lcom/clean/newsapp/ui/NewsFeedViewModel;", "getNewsFeedViewModel", "()Lcom/clean/newsapp/ui/NewsFeedViewModel;", "newsFeedViewModel$delegate", "Lkotlin/Lazy;", "handleLoadingState", "", "loading", "", "handleNewsItem", "newsItem", "Lcom/clean/newsapp/data/model/NewsItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "openMoreInfo", "moreInfoUrl", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class NewsDetailFragment extends androidx.fragment.app.Fragment {
    private com.clean.newsapp.databinding.FragmentNewsDetailBinding _binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy newsFeedViewModel$delegate = null;
    
    public NewsDetailFragment() {
        super();
    }
    
    private final com.clean.newsapp.databinding.FragmentNewsDetailBinding getBinding() {
        return null;
    }
    
    private final com.clean.newsapp.ui.detail.NewsDetailFragmentArgs getArgs() {
        return null;
    }
    
    private final com.clean.newsapp.ui.NewsFeedViewModel getNewsFeedViewModel() {
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
    
    private final void handleNewsItem(com.clean.newsapp.data.model.NewsItem newsItem) {
    }
    
    private final void handleLoadingState(boolean loading) {
    }
    
    private final void openMoreInfo(java.lang.String moreInfoUrl) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}