package com.clean.newsapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/clean/newsapp/util/NetworkStatusUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isNetworkAvailable", "", "isCurrentlyConnected", "Landroid/net/ConnectivityManager;", "app_debug"})
public final class NetworkStatusUtil {
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public NetworkStatusUtil(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    private final boolean isCurrentlyConnected(android.net.ConnectivityManager $this$isCurrentlyConnected) {
        return false;
    }
    
    /**
     * *
     *   Checks if device is connected to internet
     */
    public final boolean isNetworkAvailable() {
        return false;
    }
}