package com.example.examen_getbyte.model;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String raza;

    public Animal(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public abstract String hacerSonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", raza='" + raza + '\'' + '}';
    }
}
