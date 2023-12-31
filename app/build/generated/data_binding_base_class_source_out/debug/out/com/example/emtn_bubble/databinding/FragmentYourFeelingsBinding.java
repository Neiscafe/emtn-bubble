// Generated by view binder compiler. Do not edit!
package com.example.emtn_bubble.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.db.williamchart.view.BarChartView;
import com.example.emtn_bubble.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentYourFeelingsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final BarChartView emotionsChart;

  @NonNull
  public final RecyclerView emotionsLista;

  @NonNull
  public final FloatingActionButton fabAddEmotion;

  @NonNull
  public final MaterialToolbar toolbar;

  private FragmentYourFeelingsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull BarChartView emotionsChart, @NonNull RecyclerView emotionsLista,
      @NonNull FloatingActionButton fabAddEmotion, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.emotionsChart = emotionsChart;
    this.emotionsLista = emotionsLista;
    this.fabAddEmotion = fabAddEmotion;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentYourFeelingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentYourFeelingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_your_feelings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentYourFeelingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emotions_chart;
      BarChartView emotionsChart = ViewBindings.findChildViewById(rootView, id);
      if (emotionsChart == null) {
        break missingId;
      }

      id = R.id.emotions_lista;
      RecyclerView emotionsLista = ViewBindings.findChildViewById(rootView, id);
      if (emotionsLista == null) {
        break missingId;
      }

      id = R.id.fab_add_emotion;
      FloatingActionButton fabAddEmotion = ViewBindings.findChildViewById(rootView, id);
      if (fabAddEmotion == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentYourFeelingsBinding((CoordinatorLayout) rootView, emotionsChart,
          emotionsLista, fabAddEmotion, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
