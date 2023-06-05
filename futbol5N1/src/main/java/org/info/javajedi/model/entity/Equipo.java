package org.info.javajedi.model.entity;

public class Equipo {
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
				"nombre='" + nombreEquipo + '\'' +
				", fechaCreacion='" + fechaCreacion + '\'' +
				'}';
	}
}
