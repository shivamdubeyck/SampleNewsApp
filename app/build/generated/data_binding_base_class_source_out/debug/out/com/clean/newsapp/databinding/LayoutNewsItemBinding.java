// Generated by view binder compiler. Do not edit!
package com.clean.newsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.clean.newsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutNewsItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView newsAuthorTextview;

  @NonNull
  public final ImageView newsMediaImv;

  @NonNull
  public final TextView newsTitleTextview;

  @NonNull
  public final TextView publishedTextview;

  private LayoutNewsItemBinding(@NonNull CardView rootView, @NonNull TextView newsAuthorTextview,
      @NonNull ImageView newsMediaImv, @NonNull TextView newsTitleTextview,
      @NonNull TextView publishedTextview) {
    this.rootView = rootView;
    this.newsAuthorTextview = newsAuthorTextview;
    this.newsMediaImv = newsMediaImv;
    this.newsTitleTextview = newsTitleTextview;
    this.publishedTextview = publishedTextview;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutNewsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutNewsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_news_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutNewsItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.news_author_textview;
      TextView newsAuthorTextview = ViewBindings.findChildViewById(rootView, id);
      if (newsAuthorTextview == null) {
        break missingId;
      }

      id = R.id.news_media_imv;
      ImageView newsMediaImv = ViewBindings.findChildViewById(rootView, id);
      if (newsMediaImv == null) {
        break missingId;
      }

      id = R.id.news_title_textview;
      TextView newsTitleTextview = ViewBindings.findChildViewById(rootView, id);
      if (newsTitleTextview == null) {
        break missingId;
      }

      id = R.id.published_textview;
      TextView publishedTextview = ViewBindings.findChildViewById(rootView, id);
      if (publishedTextview == null) {
        break missingId;
      }

      return new LayoutNewsItemBinding((CardView) rootView, newsAuthorTextview, newsMediaImv,
          newsTitleTextview, publishedTextview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
