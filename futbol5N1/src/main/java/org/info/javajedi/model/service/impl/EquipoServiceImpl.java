package org.info.javajedi.model.service.impl;

import org.info.javajedi.model.entity.Entrenador;
import org.info.javajedi.model.entity.Equipo;
import org.info.javajedi.model.entity.Jugador;
import org.info.javajedi.model.service.IEquipoService;


import java.sql.SQLOutput;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EquipoServiceImpl implements IEquipoService {
Jugador jugador;
@Override
	public void create() {
	Equipo equipo = new Equipo();
	Scanner scanner = new Scanner(System.in);
	System.out.println("INGRESE EL NOMBRE DEL EQUIPO : ");
	equipo.setNombreEquipo(scanner.nextLine());
	equipo.setFechaCreacion(LocalDate.now());
	List<Jugador> listJugadores = new ArrayList<>();
	System.out.println("-------------------------------");
	System.out.println("Nombre Equipo:" + equipo.getNombreEquipo());
	System.out.println("=======================================");
	//cargar entrenador//
	EntrenadorServiceImpl entrenador =new EntrenadorServiceImpl();
	 equipo.setEntrenador(entrenador.create());

	for (int contador = 0; contador < 2; contador++) {
		JugadorServiceImpl jugadorService = new JugadorServiceImpl();
		System.out.println("***********************");
		System.out.println("Jugador N° " + contador);
		System.out.println("***********************");
		listJugadores.add(jugadorService.create());
	}
// mostrar listado jugador //
	System.out.println("****************************************************************************************************************************************************");
	System.out.println("*     Equipo : " + equipo.getNombreEquipo() + "    *");
	System.out.println("****************************************************************************************************************************************************");
	for (int i = 0; listJugadores.size() > i; i++){
		System.out.println(listJugadores.get(i).toString().toUpperCase().replace("]", "").replace(",", ""));}

	System.out.println("****************************************************************************************************************************************************");
	System.out.println("*  " + equipo.getEntrenador().toString().replace("]", "").replace(",", "").replace("{",": ")+ "   *");
	System.out.println("****************************************************************************************************************************************************");


}





	@Override
	public List<Jugador> listJugador() {
		return null;
	}
}
