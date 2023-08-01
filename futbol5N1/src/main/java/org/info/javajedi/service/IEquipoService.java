package org.info.javajedi.service;

import org.info.javajedi.model.entity.Equipo;
import org.info.javajedi.model.entity.Jugador;

import java.util.List;

public interface IEquipoService {
	void create();
	List<Jugador> listJugador();
}
