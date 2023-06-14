// Generated by Dagger (https://dagger.dev).
package com.clean.newsapp.di;

import android.content.Context;
import com.clean.newsapp.data.local.db.NewsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideNewsDaoFactory implements Factory<NewsDao> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideNewsDaoFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NewsDao get() {
    return provideNewsDao(contextProvider.get());
  }

  public static DatabaseModule_ProvideNewsDaoFactory create(Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideNewsDaoFactory(contextProvider);
  }

  public static NewsDao provideNewsDao(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideNewsDao(context));
  }
}