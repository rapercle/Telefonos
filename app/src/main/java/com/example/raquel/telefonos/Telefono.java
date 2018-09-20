package com.example.raquel.telefonos;

public class Telefono {
    private int numero;
    private String descripcion;

    public Telefono (String descripcion, int numero){
        this.descripcion = descripcion;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
