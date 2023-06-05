package org.info.javajedi.service;

import org.info.javajedi.model.entity.Jugador;

import java.util.List;

public interface IJugadorService {
	void create(Jugador jugador);
	Jugador update(Long id);
	List<Jugador> create();
}
