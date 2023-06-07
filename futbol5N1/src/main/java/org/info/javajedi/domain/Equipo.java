package org.info.javajedi.domain;

import java.util.UUID;

public class Equipo {
	UUID id = UUID.randomUUID();

	private String nombreEquipo;
	private String fechaCreacion;

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Equipo{" +
				"id=" + id +
				", nombreEquipo='" + nombreEquipo + '\'' +
				", fechaCreacion='" + fechaCreacion + '\'' +
				'}';
	}
}
