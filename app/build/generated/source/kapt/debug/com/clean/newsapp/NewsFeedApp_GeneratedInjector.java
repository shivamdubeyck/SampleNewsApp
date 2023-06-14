package com.clean.newsapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NewsFeedApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NewsFeedApp_GeneratedInjector {
  void injectNewsFeedApp(NewsFeedApp newsFeedApp);
}
