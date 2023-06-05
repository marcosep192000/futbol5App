package org.info.javajedi.model.entity;

public class Jugador extends Equipo{
	
    
        private String nombre;
	private String apellido;
	private String altura;
	private String posicion;
	private int cantGol;
	private int cantPartido;
	private boolean esCapitan;
	private int numeroCamiseta;
	// Equipo equipo ;

    public Jugador(String nombre, String apellido, String altura, String posicion, int numGol, int cantPartido, boolean esCapitan, int numeroCamiseta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.posicion = posicion;
        this.cantGol = numGol;
        this.cantPartido = cantPartido;
        this.esCapitan = esCapitan;
        this.numeroCamiseta = numeroCamiseta;
    }

    public Jugador() {
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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumGol() {
        return cantGol;
    }

    public void setNumGol(int numGol) {
        this.cantGol = numGol;
    }

    public int getCantPartido() {
        return cantPartido;
    }

    public void setCantPartido(int cantPartido) {
        this.cantPartido = cantPartido;
    }

    public boolean isEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura='" + altura + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numGol=" + cantGol +
                ", cantPartido=" + cantPartido +
                ", esCapitan=" + esCapitan +
                ", numeroCamiseta=" + numeroCamiseta +
                '}';
    }



}
