package org.info.javajedi.service.impl;

import org.info.javajedi.bootstrap.constantes.PosicionJugadores;
import org.info.javajedi.model.entity.Jugador;
import org.info.javajedi.service.IJugadorService;

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
			System.out.println("INGRESE SU POSICION: 1) MEDIOCAMPISTA, 2) DELEANTERO, 3) DEFENSOR, 4) ARQUERO");
		int option = scanner.nextInt();
		switch(option) {
			case 0:
				//if (option == 0)
			     jugador.setPosicion(PosicionJugadores.MEDIOCAMPISTA.toString());
				break;
			case 1:
				//if (option == 1)
				jugador.setPosicion(PosicionJugadores.DELEANTERO.toString());
			case 2:
			//	if (option == 2)
				jugador.setPosicion(PosicionJugadores.DEFENSOR.toString());
				break;
			case 3:
				jugador.setPosicion(PosicionJugadores.ARQUERO.toString());
				break;
				default:
				System.out.println("Opción inválida");
				break;
		}

			System.out.println("INGRESE LA ALTURA: ");
			jugador.setAltura(scanner.nextLine());
			System.out.println("INGRESE LA CANTIDAD DE GOLES: ");
			jugador.setCantGol(scanner.nextInt());
			System.out.println("INGRESE LA CANTIDAD DE PARTIDOS JUGADOS: ");
		     jugador.setCantGol(scanner.nextInt());
		System.out.println("INGRESE 1 SI ES CAPITAN  <---------------------->  2 SI NO LO ES ");
		    int options =scanner.nextInt();
			  switch(options) {
			  case 1:
				jugador.setEsCapitan("SI");
				break;
		       	case 2:
					jugador.setEsCapitan("NO");
					break;
		     	default:
				System.out.println("Opción inválida");
				break;
		         }
			System.out.println("INGRESE INGRESE EL NUMERO DE CAMISETA:");
			jugador.setNumeroCamiseta(scanner.nextInt());
		return jugador;
	}

	@Override
	public List<Jugador> lista() {


		return null
			;
	}
}
