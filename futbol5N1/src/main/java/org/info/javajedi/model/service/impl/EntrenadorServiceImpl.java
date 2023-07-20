package org.info.javajedi.model.service.impl;

import org.info.javajedi.model.entity.Entrenador;
import org.info.javajedi.model.service.IEntrenadorService;

import java.util.Scanner;

public class EntrenadorServiceImpl  implements IEntrenadorService {

	Scanner scanner = new Scanner(System.in);

	@Override
	public Entrenador create() {

		Entrenador entrenador = new Entrenador();
		System.out.println("INGRESE EL NOMBRE DEL ENTRENADOR: ");
		entrenador.setNombre(scanner.nextLine());
		return entrenador;
	}
}
