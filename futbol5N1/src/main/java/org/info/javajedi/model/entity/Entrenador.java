package org.info.javajedi.model.entity;
public class Entrenador {
    private String nombre;
    private String apellido;
    private int edad;
    private Equipo equipo;

//--------------------------------------------------------------//

    public Entrenador(String nombre, String apellido, int edad, Equipo equipo) {
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

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
