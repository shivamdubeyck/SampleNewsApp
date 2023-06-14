// Generated by Dagger (https://dagger.dev).
package com.clean.newsapp.ui.adapter;

import com.clean.newsapp.util.DateTimeUtil;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsListAdapter_Factory implements Factory<NewsListAdapter> {
  private final Provider<DateTimeUtil> dateTimeUtilProvider;

  private final Provider<Function1<? super Integer, Unit>> newsItemListenerProvider;

  public NewsListAdapter_Factory(Provider<DateTimeUtil> dateTimeUtilProvider,
      Provider<Function1<? super Integer, Unit>> newsItemListenerProvider) {
    this.dateTimeUtilProvider = dateTimeUtilProvider;
    this.newsItemListenerProvider = newsItemListenerProvider;
  }

  @Override
  public NewsListAdapter get() {
    return newInstance(dateTimeUtilProvider.get(), newsItemListenerProvider.get());
  }

  public static NewsListAdapter_Factory create(Provider<DateTimeUtil> dateTimeUtilProvider,
      Provider<Function1<? super Integer, Unit>> newsItemListenerProvider) {
    return new NewsListAdapter_Factory(dateTimeUtilProvider, newsItemListenerProvider);
  }

  public static NewsListAdapter newInstance(DateTimeUtil dateTimeUtil,
      Function1<? super Integer, Unit> newsItemListener) {
    return new NewsListAdapter(dateTimeUtil, newsItemListener);
  }
}
