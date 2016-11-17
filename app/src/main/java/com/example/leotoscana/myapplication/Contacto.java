package com.example.leotoscana.myapplication;

/**
 * Created by LeoToscana on 31/10/2016.
 */

public class Contacto {
    private String  nombre;
    private int  telefono;
    private int     image;



    public Contacto(String nombre, int telefono, int image) {
        this.nombre   = nombre;
        this.telefono = telefono;
        this.image    = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getImage() {return image;}

    public void setImage(int image) {this.image = image;}

}
