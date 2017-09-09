package com.loktra.interviewapp.view.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.loktra.interviewapp.R;
import com.loktra.interviewapp.data.model.ProjectResponse;
import com.loktra.interviewapp.databinding.ContentItemsBinding;
import com.loktra.interviewapp.util.CircleTransform;
import com.squareup.picasso.Picasso;
import java.util.List;
import javax.inject.Inject;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

public class ContentAdapter extends RecyclerView.Adapter {

  @Inject Picasso mPicasso;
  private ContentItemsBinding mBinding;
  private List<ProjectResponse> contentList;
  private Context mContext;

  public ContentAdapter(List<ProjectResponse> contentList, Context context) {
    this.contentList = contentList;
    this.mContext = context;
  }

  @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    mBinding =
        DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.content_items,
            parent, false);
    return new ContentViewHolder(mBinding);
  }

  @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    mPicasso.with(mBinding.getRoot().getContext())
        .load(contentList.get(position).getAuthor().getAvatar_url())
        .transform(new CircleTransform())
        .into(mBinding.imgThumbnail);

    ((ContentViewHolder) holder).binding.textCommiterName.setText(
        contentList.get(position).getCommit().getAuthor().getName());
    ((ContentViewHolder) holder).binding.textCommiterId.setText(
        String.format("ID : %s", contentList.get(position).getSha()).substring(0, 30));
    ((ContentViewHolder) holder).binding.textCommiterMessage.setText(
        String.format("Message : %s", contentList.get(position).getCommit().getMessage()));
  }

  @Override public int getItemCount() {
    return contentList == null ? 0 : contentList.size();
  }

  private class ContentViewHolder extends RecyclerView.ViewHolder {

    private ContentItemsBinding binding;

    public ContentViewHolder(ContentItemsBinding mBinding) {
      super(mBinding.getRoot());
      this.binding = mBinding;

      mBinding.getRoot().setOnClickListener(view -> {
        new AlertDialog.Builder(mBinding.getRoot().getContext()).setTitle(
            contentList.get(getAdapterPosition()).getCommit().getAuthor().getName())
            .setMessage(contentList.get(getAdapterPosition()).getCommit().getMessage())
            .setPositiveButton(R.string.button_ok, null)
            .create()
            .show();
      });
    }
  }
}
