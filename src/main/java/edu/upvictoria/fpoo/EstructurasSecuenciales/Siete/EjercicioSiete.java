package edu.upvictoria.fpoo.EstructurasSecuenciales.Siete;

import java.util.Scanner;

public class EjercicioSiete {
    public EjercicioSiete(){

        Float unGalon = (float) 3.785F;

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Entrega de producto en litros");
        System.out.print("Ingrese la cantidad de litros: ");
        Float cantidadLitros = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el precio del galon: ");
        Float precioGalon = Float.valueOf(entradaTeclado.nextLine());

        Float total = (cantidadLitros/unGalon) * precioGalon;

        System.out.println("El pago sera de: "+total);



    }
}
