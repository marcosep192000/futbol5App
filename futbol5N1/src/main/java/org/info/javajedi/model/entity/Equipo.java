package org.info.javajedi.model.entity;
import java.time.LocalDate;
import java.util.List;

public class Equipo {
	private String nombreEquipo;
	private LocalDate fechaCreacion;
    private List<Jugador> jugadorList;
	private Entrenador entrenador;

	//-----------------------------------------//

	public Equipo(String nombreEquipo, LocalDate fechaCreacion, List<Jugador> jugadorList, Entrenador entrenador) {
		this.nombreEquipo = nombreEquipo;
		this.fechaCreacion = fechaCreacion;
		this.jugadorList = jugadorList;
		this.entrenador = entrenador;
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

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public Entrenador setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
		return entrenador;
	}

	@Override
	public String toString() {
		return "Equipo{" +
				"nombreEquipo='" + nombreEquipo + '\'' +
				", fechaCreacion=" + fechaCreacion +
				", jugadorList=" + jugadorList +
				", entrenador=" + entrenador +
				'}';
	}
}
