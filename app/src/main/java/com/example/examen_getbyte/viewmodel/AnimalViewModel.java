package com.example.examen_getbyte.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.examen_getbyte.model.Animal;
import com.example.examen_getbyte.model.Gato;
import com.example.examen_getbyte.model.Perro;

import java.util.ArrayList;
import java.util.List;

public class AnimalViewModel extends ViewModel {
    private MutableLiveData<List<Animal>> AnimalList;

    public LiveData<List<Animal>> getAnimalList(){
        if (AnimalList == null){
            AnimalList = new MutableLiveData<>();
            CargarDatos();
        }
        return AnimalList;
    }

    private void CargarDatos(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Gato("Brillyt", 2, "Gata de casa"));
        animals.add(new Gato("Gringacho", 2, "Gato de casa"));
        animals.add(new Gato("Briza", 3, "Gata de casa"));
        animals.add(new Perro("Rex", 4, "Bulldog"));

        AnimalList.setValue(animals);
    }
}
