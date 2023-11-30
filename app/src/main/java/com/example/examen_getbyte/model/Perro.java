package com.example.examen_getbyte.model;

public class Perro extends Animal{
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad, raza);
    }
    @Override
    public String hacerSonido(){
        return "Guauf! >:u";
    }
}
