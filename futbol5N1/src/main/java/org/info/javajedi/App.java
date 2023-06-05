package org.info.javajedi;

import org.info.javajedi.model.entity.Jugador;

public class App
{
    public static void main( String[] args )
    {
        Jugador j = new Jugador();
        j.setNombreEquipo("el carpincho pincho");
        j.setAltura("1.50");
        j.setApellido("paz");
        System.out.println(j);
    }
}
