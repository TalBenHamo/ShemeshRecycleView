package com.example.shemeshresacleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView nameview;
    TextView descriptionview;
    ImageView imageView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nameview = itemView.findViewById(R.id.name);
        descriptionview = itemView.findViewById(R.id.description);
        imageView = itemView.findViewById(R.id.imageview);
    }
}
