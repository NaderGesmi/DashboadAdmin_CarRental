package com.example.bottomnavigationview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import models.Agence;

public class AgenceAdapter extends  RecyclerView.Adapter<AgenceAdapter.ViewHoler> {

    ArrayList<Agence> agences ;

    public AgenceAdapter(ArrayList<Agence> agences) {
        this.agences = agences;
    }

    @NonNull
    @Override
    public AgenceAdapter.ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_agence, parent, false);
        return new AgenceAdapter.ViewHoler(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
Agence agence=agences.get(position);

        holder.image.setImageResource(agence.getImage());
        holder.name.setText(agence.getName());
        holder.location.setText(agence.getLocation());

    }
    @Override
    public int getItemCount() {
        return agences.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name, location;
        public ViewHoler(@NonNull View itemView) {
            super(itemView);
image=itemView.findViewById(R.id.agence_img);
name=itemView.findViewById(R.id.agence_name);
location=itemView.findViewById(R.id.agence_location);



        }
    }
}
