package com.clean.newsapp.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001aJ\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062)\b\u0004\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b\u00a2\u0006\u0002\b\fH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"gone", "", "Landroid/view/View;", "launchAndRepeatWithViewLifecycle", "Landroidx/fragment/app/Fragment;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;)V", "loadImage", "Landroid/widget/ImageView;", "imageUrl", "", "visible", "app_debug"})
public final class ExtensionsKt {
    
    /**
     * *
     *  Set the View visibility to visible
     */
    public static final void visible(@org.jetbrains.annotations.NotNull
    android.view.View $this$visible) {
    }
    
    /**
     * *
     *  Set the View visibility to gone
     */
    public static final void gone(@org.jetbrains.annotations.NotNull
    android.view.View $this$gone) {
    }
    
    /**
     * *
     *  Load images as an extension fun
     *  Currently using Coil for image loading
     */
    public static final void loadImage(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$loadImage, @org.jetbrains.annotations.NotNull
    java.lang.String imageUrl) {
    }
    
    /**
     * Launches a new coroutine and repeats `block` every time the Fragment's viewLifecycleOwner
     * is in and out of `minActiveState` lifecycle state.
     */
    public static final void launchAndRepeatWithViewLifecycle(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$launchAndRepeatWithViewLifecycle, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Lifecycle.State minActiveState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
}