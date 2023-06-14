package com.clean.newsapp.ui.detail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NewsDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private NewsDetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private NewsDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static NewsDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    NewsDetailFragmentArgs __result = new NewsDetailFragmentArgs();
    bundle.setClassLoader(NewsDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("newsItemId")) {
      int newsItemId;
      newsItemId = bundle.getInt("newsItemId");
      __result.arguments.put("newsItemId", newsItemId);
    } else {
      throw new IllegalArgumentException("Required argument \"newsItemId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static NewsDetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    NewsDetailFragmentArgs __result = new NewsDetailFragmentArgs();
    if (savedStateHandle.contains("newsItemId")) {
      int newsItemId;
      newsItemId = savedStateHandle.get("newsItemId");
      __result.arguments.put("newsItemId", newsItemId);
    } else {
      throw new IllegalArgumentException("Required argument \"newsItemId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getNewsItemId() {
    return (int) arguments.get("newsItemId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("newsItemId")) {
      int newsItemId = (int) arguments.get("newsItemId");
      __result.putInt("newsItemId", newsItemId);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("newsItemId")) {
      int newsItemId = (int) arguments.get("newsItemId");
      __result.set("newsItemId", newsItemId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    NewsDetailFragmentArgs that = (NewsDetailFragmentArgs) object;
    if (arguments.containsKey("newsItemId") != that.arguments.containsKey("newsItemId")) {
      return false;
    }
    if (getNewsItemId() != that.getNewsItemId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getNewsItemId();
    return result;
  }

  @Override
  public String toString() {
    return "NewsDetailFragmentArgs{"
        + "newsItemId=" + getNewsItemId()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull NewsDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int newsItemId) {
      this.arguments.put("newsItemId", newsItemId);
    }

    @NonNull
    public NewsDetailFragmentArgs build() {
      NewsDetailFragmentArgs result = new NewsDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNewsItemId(int newsItemId) {
      this.arguments.put("newsItemId", newsItemId);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getNewsItemId() {
      return (int) arguments.get("newsItemId");
    }
  }
}
