// Generated by Dagger (https://dagger.dev).
package com.clean.newsapp.di;

import android.content.Context;
import com.clean.newsapp.util.NetworkStatusUtil;
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
public final class AppModule_ProvidesNetworkStatusUtilFactory implements Factory<NetworkStatusUtil> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvidesNetworkStatusUtilFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkStatusUtil get() {
    return providesNetworkStatusUtil(contextProvider.get());
  }

  public static AppModule_ProvidesNetworkStatusUtilFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvidesNetworkStatusUtilFactory(contextProvider);
  }

  public static NetworkStatusUtil providesNetworkStatusUtil(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesNetworkStatusUtil(context));
  }
}
