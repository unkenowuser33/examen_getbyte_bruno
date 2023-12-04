package com.example.examen_getbyte.ui.Animal;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.examen_getbyte.R;
import com.example.examen_getbyte.model.Animal;
import com.example.examen_getbyte.viewmodel.AnimalViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AnimalViewModel animalViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final AnimalAdapter adapter = new AnimalAdapter(this); // Contexto
        recyclerView.setAdapter(adapter);

        animalViewModel = new ViewModelProvider(this).get(AnimalViewModel.class);
        animalViewModel.getAnimalList().observe(this, new Observer<List<Animal>>() {
            @Override
            public void onChanged(List<Animal> animals) {
                adapter.setAnimales(animals);

                ListasConsola(animals);
            }
        });
    }

    private void ListasConsola(List<Animal> animals){
        for (Animal animal : animals){
            Log.d("Lista", "Nombre: " + animal.getNombre() + "Edad: " + animal.getEdad() + "Raza: " + animal.getRaza());
        }
    }
}