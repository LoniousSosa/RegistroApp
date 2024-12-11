package com.example.registroapp;

public class Alumno {
    private String nombre;
    private String clase;

    public Alumno(String nombre, String clase) {
        this.nombre = nombre;
        this.clase = clase;
    }

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }
}
