package com.umut.expandablrecyclerview.adapter.holder;

import android.support.annotation.NonNull;
import android.view.View;

import com.umut.expandablrecyclerview.adapter.ChildCoordinate;

import java.util.List;

public abstract class ChildViewHolder extends ExpandableViewHolder<ChildCoordinate> {

    public ChildViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public boolean update(@NonNull List<Object> payload, ChildCoordinate coordinate) {
        return false;
    }
}
