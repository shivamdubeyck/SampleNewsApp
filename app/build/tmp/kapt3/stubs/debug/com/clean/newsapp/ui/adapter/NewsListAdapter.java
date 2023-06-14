package com.clean.newsapp.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/clean/newsapp/ui/adapter/NewsListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/clean/newsapp/data/model/NewsItem;", "Lcom/clean/newsapp/ui/adapter/NewsListAdapter$NewsViewHolder;", "dateTimeUtil", "Lcom/clean/newsapp/util/DateTimeUtil;", "newsItemListener", "Lkotlin/Function1;", "", "", "(Lcom/clean/newsapp/util/DateTimeUtil;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NewsViewHolder", "app_debug"})
public final class NewsListAdapter extends androidx.recyclerview.widget.ListAdapter<com.clean.newsapp.data.model.NewsItem, com.clean.newsapp.ui.adapter.NewsListAdapter.NewsViewHolder> {
    private final com.clean.newsapp.util.DateTimeUtil dateTimeUtil = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> newsItemListener = null;
    
    @javax.inject.Inject
    public NewsListAdapter(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.util.DateTimeUtil dateTimeUtil, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> newsItemListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.clean.newsapp.ui.adapter.NewsListAdapter.NewsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.clean.newsapp.ui.adapter.NewsListAdapter.NewsViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/clean/newsapp/ui/adapter/NewsListAdapter$NewsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clean/newsapp/databinding/LayoutNewsItemBinding;", "(Lcom/clean/newsapp/databinding/LayoutNewsItemBinding;)V", "getBinding", "()Lcom/clean/newsapp/databinding/LayoutNewsItemBinding;", "app_debug"})
    public static final class NewsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.clean.newsapp.databinding.LayoutNewsItemBinding binding = null;
        
        public NewsViewHolder(@org.jetbrains.annotations.NotNull
        com.clean.newsapp.databinding.LayoutNewsItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.clean.newsapp.databinding.LayoutNewsItemBinding getBinding() {
            return null;
        }
    }
}