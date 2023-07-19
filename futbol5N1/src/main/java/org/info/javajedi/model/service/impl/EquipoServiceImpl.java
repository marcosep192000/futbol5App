package org.info.javajedi.model.service.impl;

import org.info.javajedi.model.entity.Equipo;
import org.info.javajedi.model.entity.Jugador;
import org.info.javajedi.model.service.IEquipoService;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquipoServiceImpl implements IEquipoService {
	@Override
	public void create() {
		 Equipo equipo = new Equipo();
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("INGRESE EL NOMBRE DEL EQUIPO : ");
		 equipo.setNombreEquipo(scanner.nextLine());
		 equipo.setFechaCreacion(LocalDate.now());
		System.out.println("-------------------------------");
		 System.out.println(equipo.toString());
		JugadorServiceImpl jugadorService = new JugadorServiceImpl();
		List<Jugador> listJugadores = new ArrayList<>();

		Integer contador = 0 ;
		while (contador <= 1) {
			contador++;
			System.out.println("***********************");
			System.out.println("Jugador N° " + contador);
			System.out.println("***********************");
			listJugadores.add(jugadorService.create());
		}
		equipo.setJugadorList(listJugadores);
		System.out.println("Nombre Equipo:"+equipo.getNombreEquipo());
		System.out.println("=======================================");
        for (int i = 0 ; i <= listJugadores.toArray().length; i ++ ){
			System.out.println(listJugadores);
		}
	}
}
