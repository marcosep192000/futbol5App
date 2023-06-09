package org.info.javajedi.service.equipo.Impl;

import org.info.javajedi.model.entity.Equipo;
import org.info.javajedi.model.entity.Jugador;
import org.info.javajedi.service.equipo.IEquipoService;
import org.info.javajedi.service.jugador.impl.JugadorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquipoService implements IEquipoService {
    private static Equipo equipo;
	static JugadorService jugadorService;
	@Override
	public void create() {
		Scanner scanner = new Scanner(System.in);

		Equipo equipo1 = new Equipo();
		System.out.println("ingrese el Nombre del equipo a registrar:");
		equipo1.setNombreEquipo(scanner.nextLine());
		equipo1.setFechaCreacion(equipo1.getFechaCreacion());
		System.out.println("-------------------------");
		System.out.println("-- registro de jugador --");
		System.out.println("-------------------------");
		JugadorService jugadorService = new JugadorService();
		List<Jugador> listJugadores = new ArrayList<>();
		listJugadores.add(jugadorService.create());
		equipo1.setJugadorList(listJugadores);
		System.out.println(equipo1.getJugadorList());
	}

	@Override
	public List<Equipo> list() {
		return null ;
	}
}
