package org.info.javajedi.model.entity;

import java.util.UUID;

public class Entrenador {

    UUID  id = UUID.randomUUID();
    private String nombre;
    private String apellido;
    private int edad;
    private Equipo equipo;

//--------------------------------------------------------------//

    public Entrenador(UUID id, String nombre, String apellido, int edad, Equipo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.equipo = equipo;
    }


    public Entrenador() {
    }

    //--------------------------------------------------------------//
    
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", equipo=" + equipo +
                '}';
    }
}
