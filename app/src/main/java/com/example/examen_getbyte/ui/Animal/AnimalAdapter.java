package com.example.examen_getbyte.ui.Animal;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen_getbyte.R;
import com.example.examen_getbyte.model.Animal;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    private List<Animal> animales;

    public void setAnimales(List<Animal> animales){
        this.animales = animales;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AnimalAdapter.AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalAdapter.AnimalViewHolder holder, int position) {
        if (animales != null) {
            Animal animal = animales.get(position);
            holder.item_anl_tv_nombre.setText(animal.getNombre());
            holder.item_anl_tv_edad.setText(String.valueOf(animal.getEdad()));
            holder.item_anl_tv_raza.setText(animal.getRaza());
            holder.item_anl_tv_snd_gato.setText(animal.hacerSonido());
        }
    }

    @Override
    public int getItemCount() {
        return animales != null ? animales.size() : 0;
    }

    static class AnimalViewHolder extends RecyclerView.ViewHolder{
        TextView item_anl_tv_nombre;
        TextView item_anl_tv_edad;
        TextView item_anl_tv_raza;
        TextView item_anl_tv_snd_gato;

        AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            item_anl_tv_nombre = itemView.findViewById(R.id.item_anl_tv_nombre);
            item_anl_tv_edad = itemView.findViewById(R.id.item_anl_tv_edad);
            item_anl_tv_raza = itemView.findViewById(R.id.item_anl_tv_raza);
            item_anl_tv_snd_gato = itemView.findViewById(R.id.item_anl_tv_snd_gato);
        }
    }
}
