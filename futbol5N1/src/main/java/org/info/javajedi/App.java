package org.info.javajedi;

import org.info.javajedi.model.entity.Equipo;
import org.info.javajedi.model.entity.Jugador;
import org.info.javajedi.model.service.impl.EquipoServiceImpl;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            do {
                System.out.println("Menu de opciones!");
                System.out.println("________________");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("-----------------");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                option = scanner.nextInt();

                switch(option) {
                    case 1:
                        System.out.println("Ha seleccionado la opción 1 Crear Equipo:" );
                        EquipoServiceImpl equipo = new EquipoServiceImpl();
                       equipo.create();

                        break;
                    case 2:
                        System.out.println("Ha seleccionado la opción 2");


                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");

                        break;

                    default:
                        System.out.println("Opción inválida");
                        break;
                }

                System.out.println();
            } while(option != 3);

            scanner.close();
        }
    }
}
