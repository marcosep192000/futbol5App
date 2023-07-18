package org.info.javajedi.model.entity;
import java.util.Date;
import java.util.List;

public class Equipo {
	private String nombreEquipo;
	private Date fechaCreacion;
    private List<Jugador> jugadorList;

	//-----------------------------------------//

	public Equipo(String nombreEquipo, Date fechaCreacion, List<Jugador> jugadorList) {
		this.nombreEquipo = nombreEquipo;
		this.fechaCreacion = fechaCreacion;
		this.jugadorList = jugadorList;
	}
	public Equipo() {
	}
	//-----------------------------------------//
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public List<Jugador> getJugadorList() {
		return jugadorList;
	}
	public void setJugadorList(List<Jugador> jugadorList) {
		this.jugadorList = jugadorList;
	}
}
