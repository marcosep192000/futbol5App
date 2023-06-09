package org.info.javajedi.service.jugador.impl;

import org.info.javajedi.model.entity.Jugador;

import java.util.Scanner;

public class JugadorService {

	public Jugador create() {

		Scanner scanner = new Scanner(System.in);
		Jugador jugador = new Jugador();

		System.out.println("ingrese la altura  del jugador:");
		jugador.setAltura(scanner.nextLine());

		System.out.println("ingrese si/no si   este jugador es capitan del equipo:");
		jugador.setNombre(scanner.nextLine());

		System.out.println("ingrese apellido del registrar:");
		jugador.setApellido(scanner.nextLine());

		System.out.println("ingrese la cantidad de partidos jugados  registrar:");
	    jugador.setCantPartido(scanner.nextInt());

		System.out.println("ingrese si/no si   este jugador es capitan del equipo:");
	    jugador.setEsCapitan(scanner.nextLine());

		System.out.println("ingrese el numero de goles marcados:");
		jugador.setCantGol(scanner.nextInt());

		System.out.println("ingrese el numero de camiseta desde el 1 al 99:");
	    jugador.setNumeroCamiseta(scanner.nextInt());

		System.out.println("Ingrese su posicion : Arquero | Defensor | Mediocampista | Delantero");
	    jugador.setPosicion(scanner.nextLine());
		 System.out.println(jugador);

		return jugador;
	}
}
