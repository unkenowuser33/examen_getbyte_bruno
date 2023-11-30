package com.example.examen_getbyte.model;

public class Gato extends Animal{
    public Gato(String nombre, int edad, String raza){
        super(nombre, edad, raza);
    }
    @Override
    public String hacerSonido(){
        return "Meow :3";
    }
}
