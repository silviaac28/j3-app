package com.j3appdemo.j3_app.models;

public class User {
    private String nombreContacto;
    private String nombre;
    private String apellido;

    // Constructor vacío
    public User() {}

    public User(String nombreContacto, String nombre, String apellido) {
        this.nombreContacto = nombreContacto;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters
    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
