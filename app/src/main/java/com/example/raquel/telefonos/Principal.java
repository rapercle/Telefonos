package com.example.raquel.telefonos;

import android.app.Person;

import java.util.ArrayList;

public class Principal {
    public static void main (String args[]){
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona yo = new Persona("73599722K", "Raquel", "Perpiña");
        Persona tu = new Persona("X9333204B", "Rosa", "Van der Heide");

        yo.setEdad(18);
        yo.setGenero("Femenino");
        yo.setNacionalidad("España");

        tu.setEdad(18);
        tu.setGenero("Femenino");
        tu.setNacionalidad("Holanda");

        yo.anyadir(new Telefono("Movil", 678263549));
        yo.anyadir(new Telefono("Trabajo", 961784587));

        tu.anyadir(new Telefono("Movil", 747384928));
        tu.anyadir(new Telefono("Trabajo", 961792748));

        personas.add(yo);
        personas.add(tu);

        //Buscar una persona dado un nombre
        Persona p = buscar(personas, "Raquel");
        //mostrar todos los tlf
        p.mostrarTelefonos();
        System.out.println(yo.toString());
    }

    public static Persona buscar (ArrayList<Persona> personas,
                                  String nombre){

        for (int i=0; i<personas.size(); i++){
            if (personas.get(i).getNombre() == nombre) {
                return personas.get(i);
            }
        }
        return null;
    }
}
