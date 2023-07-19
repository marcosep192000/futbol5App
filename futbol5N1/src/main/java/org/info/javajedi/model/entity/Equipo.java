package org.info.javajedi.model.entity;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Equipo {
	private String nombreEquipo;
	private LocalDate fechaCreacion;
    private List<Jugador> jugadorList;

	//-----------------------------------------//

	public Equipo(String nombreEquipo, LocalDate fechaCreacion, List<Jugador> jugadorList) {
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

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Jugador> getJugadorList() {
		return jugadorList;
	}
	public void setJugadorList(List<Jugador> jugadorList) {
		this.jugadorList = jugadorList;
	}

	@Override
	public String toString() {
		return "Equipo{" +
				"nombreEquipo='" + nombreEquipo + '\'' +
				", fechaCreacion=" + fechaCreacion +
				", jugadorList=" + jugadorList +
				'}';
	}
}
