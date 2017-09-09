package com.loktra.interviewapp.view.adapter;

import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContentAdapter_MembersInjector implements MembersInjector<ContentAdapter> {
  private final Provider<Picasso> mPicassoProvider;

  public ContentAdapter_MembersInjector(Provider<Picasso> mPicassoProvider) {
    assert mPicassoProvider != null;
    this.mPicassoProvider = mPicassoProvider;
  }

  public static MembersInjector<ContentAdapter> create(Provider<Picasso> mPicassoProvider) {
    return new ContentAdapter_MembersInjector(mPicassoProvider);
  }

  @Override
  public void injectMembers(ContentAdapter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPicasso = mPicassoProvider.get();
  }

  public static void injectMPicasso(ContentAdapter instance, Provider<Picasso> mPicassoProvider) {
    instance.mPicasso = mPicassoProvider.get();
  }
}
