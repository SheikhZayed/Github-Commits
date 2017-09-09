package com.loktra.interviewapp.view.ui.home;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.loktra.interviewapp.R;
import com.loktra.interviewapp.databinding.FragmentHomeBinding;
import com.loktra.interviewapp.di.components.Injectable;
import com.loktra.interviewapp.util.DialogUtils;
import com.loktra.interviewapp.view.adapter.ContentAdapter;

import javax.inject.Inject;

public class HomeFragment extends LifecycleFragment implements Injectable {

  String TAG = "logger";
  @Inject
  ViewModelProvider.Factory mViewModelFactory;
  @Inject
  DialogUtils mDialogUtils;
  private FragmentHomeBinding mBinding;


  public HomeFragment() {
    // Required empty public constructor
  }

  public static HomeFragment newInstance() {
    return new HomeFragment();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
    initViews();
    return mBinding.getRoot();
  }

  private void initViews() {
    LinearLayoutManager llm = new LinearLayoutManager(getActivity());
    llm.setOrientation(LinearLayoutManager.VERTICAL);
    mBinding.listContent.setLayoutManager(llm);
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    HomeViewModel homeViewModel = ViewModelProviders.of(this, mViewModelFactory)
            .get(HomeViewModel.class);
    observeViewModel(homeViewModel);

  }

  private void observeViewModel(HomeViewModel homeViewModel) {
    mDialogUtils.showProgress(getContext(), getResources().getString(R.string.loading_message));
    homeViewModel.getCommitListObservable().observe(this, content -> {
      if (content != null) {
        mBinding.listContent.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        ContentAdapter contentAdapter = new ContentAdapter(content,getContext());
        contentAdapter.setHasStableIds(true);
        mBinding.listContent.setAdapter(contentAdapter);
        mDialogUtils.hideProgress();
      }
      else
      {
        mDialogUtils.hideProgress();
      }
    });
  }
}
