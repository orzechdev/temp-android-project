package com.apartamentsamples.app;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ApartamentsAdapter extends RecyclerView.Adapter<ApartamentsAdapter.ApartamentsViewHolder> {
    private ArrayList<String> apartaments;

    public static class ApartamentsViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ApartamentsViewHolder(@NonNull View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.item_text_view);
        }
    }

    public ApartamentsAdapter(ArrayList<String> apartaments) {
        this.apartaments = apartaments;
    }

    @NonNull
    @Override
    public ApartamentsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ConstraintLayout layout = (ConstraintLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);

        ApartamentsViewHolder apartamentsViewHolder = new ApartamentsViewHolder(layout);

        return apartamentsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ApartamentsViewHolder apartamentsViewHolder, int i) {
        apartamentsViewHolder.textView.setText(apartaments.get(i));
    }

    @Override
    public int getItemCount() {
        return apartaments.size();
    }
}