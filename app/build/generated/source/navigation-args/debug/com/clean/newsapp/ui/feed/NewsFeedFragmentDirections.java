package com.clean.newsapp.ui.feed;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.clean.newsapp.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NewsFeedFragmentDirections {
  private NewsFeedFragmentDirections() {
  }

  @NonNull
  public static ToNewsDetailFragment toNewsDetailFragment(int newsItemId) {
    return new ToNewsDetailFragment(newsItemId);
  }

  public static class ToNewsDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToNewsDetailFragment(int newsItemId) {
      this.arguments.put("newsItemId", newsItemId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToNewsDetailFragment setNewsItemId(int newsItemId) {
      this.arguments.put("newsItemId", newsItemId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("newsItemId")) {
        int newsItemId = (int) arguments.get("newsItemId");
        __result.putInt("newsItemId", newsItemId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.to_newsDetailFragment;
    }

    @SuppressWarnings("unchecked")
    public int getNewsItemId() {
      return (int) arguments.get("newsItemId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToNewsDetailFragment that = (ToNewsDetailFragment) object;
      if (arguments.containsKey("newsItemId") != that.arguments.containsKey("newsItemId")) {
        return false;
      }
      if (getNewsItemId() != that.getNewsItemId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getNewsItemId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToNewsDetailFragment(actionId=" + getActionId() + "){"
          + "newsItemId=" + getNewsItemId()
          + "}";
    }
  }
}
