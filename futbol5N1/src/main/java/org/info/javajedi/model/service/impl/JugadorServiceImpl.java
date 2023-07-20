package org.info.javajedi.model.service.impl;

import org.info.javajedi.model.entity.Equipo;
import org.info.javajedi.model.entity.Jugador;
import org.info.javajedi.model.service.IJugadorService;

import java.util.List;
import java.util.Scanner;

public class JugadorServiceImpl implements IJugadorService {

	Scanner scanner = new Scanner(System.in);
	Jugador jugador = new Jugador();
	@Override
	public Jugador create() {


		System.out.println("INGRESE EL NOMBRE DEL JUGADOR: ");
		jugador.setNombre(scanner.nextLine());

		System.out.println("INGRESE EL ALPELLIDO DEL JUGADOR: ");
		jugador.setApellido(scanner.nextLine());
			System.out.println("INGRESE SU POSICION: ");
			jugador.setPosicion(scanner.nextLine());
			System.out.println("INGRESE LA ALTURA: ");
			jugador.setAltura(scanner.nextLine());
			System.out.println("INGRESE LA CANTIDAD DE GOLES: ");
			jugador.setCantGol(scanner.nextInt());
			System.out.println("INGRESE LA CANTIDAD DE PARTIDOS JUGADOS: ");
			jugador.setCantPartido(scanner.nextInt());
			System.out.println("INGRESE SI ES CAPITAN DEL EQUIPO: ");
			jugador.setEsCapitan(scanner.nextLine());
			System.out.println("INGRESE INGRESE EL NUMERO DE CAMISETA: ");
			jugador.setNumeroCamiseta(scanner.nextInt());
		return jugador;
	}

	@Override
	public List<Jugador> lista() {


		return null
			;
	}
}
