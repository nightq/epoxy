package com.airbnb.epoxy;

import android.view.View;

@EpoxyModelClass
public abstract class AbstractModelWithHolder
    extends EpoxyModelWithHolder<AbstractModelWithHolder.Holder> {
  @EpoxyAttribute int value;

  @Override
  protected int getDefaultLayout() {
    return 0;
  }

  static class Holder extends EpoxyHolder {

    protected void bindView(View itemView) {

    }
  }
}