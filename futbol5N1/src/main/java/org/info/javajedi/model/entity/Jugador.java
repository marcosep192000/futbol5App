package org.info.javajedi.model.entity;
public class Jugador {
    private String nombre;
    private String apellido;
	private String altura;
	private String posicion;
	private int cantGol;
	private int cantPartido;
	private String esCapitan;
	private int numeroCamiseta;

    public Jugador(String nombre, String apellido, String altura, String posicion, int cantGol, int cantPartido, String esCapitan, int numeroCamiseta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.posicion = posicion;
        this.cantGol = cantGol;
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

    public int getCantGol() {
        return cantGol;
    }

    public void setCantGol(int cantGol) {
        this.cantGol = cantGol;
    }

    public int getCantPartido() {
        return cantPartido;
    }

    public void setCantPartido(int cantPartido) {
        this.cantPartido = cantPartido;
    }

    public String getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(String esCapitan) {
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
                ", cantGol=" + cantGol +
                ", cantPartido=" + cantPartido +
                ", esCapitan='" + esCapitan + '\'' +
                ", numeroCamiseta=" + numeroCamiseta +
                '}';
    }
}
