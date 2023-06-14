// Generated by view binder compiler. Do not edit!
package com.clean.newsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.clean.newsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNewsDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout moreInfoView;

  @NonNull
  public final TextView newsDescTextview;

  @NonNull
  public final ImageView newsMediaImv;

  @NonNull
  public final TextView newsTitleTextview;

  @NonNull
  public final ProgressBar progressBar;

  private FragmentNewsDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout moreInfoView, @NonNull TextView newsDescTextview,
      @NonNull ImageView newsMediaImv, @NonNull TextView newsTitleTextview,
      @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.moreInfoView = moreInfoView;
    this.newsDescTextview = newsDescTextview;
    this.newsMediaImv = newsMediaImv;
    this.newsTitleTextview = newsTitleTextview;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNewsDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNewsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_news_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNewsDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.more_info_view;
      LinearLayout moreInfoView = ViewBindings.findChildViewById(rootView, id);
      if (moreInfoView == null) {
        break missingId;
      }

      id = R.id.news_desc_textview;
      TextView newsDescTextview = ViewBindings.findChildViewById(rootView, id);
      if (newsDescTextview == null) {
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

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new FragmentNewsDetailBinding((ConstraintLayout) rootView, moreInfoView,
          newsDescTextview, newsMediaImv, newsTitleTextview, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}