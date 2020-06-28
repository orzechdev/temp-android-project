package com.apartamentsamples.app;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ApartamentsAdapter extends RecyclerView.Adapter<ApartamentsAdapter.ApartamentsViewHolder> {
    private ArrayList<Apartament> apartaments;

    public static class ApartamentsViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageView;
        TextView textTitle;
        TextView textDescription;

        public ApartamentsViewHolder(@NonNull View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.item_card);
            imageView = (ImageView) view.findViewById(R.id.itemImageView);
            textTitle = (TextView) view.findViewById(R.id.itemTextTitle);
            textDescription = (TextView) view.findViewById(R.id.itemTextDescription);
        }
    }

    public ApartamentsAdapter(ArrayList<Apartament> apartaments) {
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
    public void onBindViewHolder(@NonNull final ApartamentsViewHolder apartamentsViewHolder, int i) {
        apartamentsViewHolder.textTitle.setText(apartaments.get(i).getTitle());
        apartamentsViewHolder.textDescription.setText(apartaments.get(i).getDescription());
        apartamentsViewHolder.imageView.setImageResource(R.drawable.apartament_image);
        apartamentsViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = apartamentsViewHolder.cardView.getContext();
                Intent intent = new Intent(context, ApartmentActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return apartaments.size();
    }
}