package edu.upvictoria.fpoo.EstructurasSecuenciales.Dieciocho;

import java.util.Scanner;

public class EjercicioDieciocho {
    public EjercicioDieciocho(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Costo de boleto de autobus");
        System.out.print("Ingrese los Kilometros a recorrer: ");
        Float kilometros = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingresa el precio por kilometro: ");
        Float precio = Float.valueOf(entradaTeclado.nextLine());

        Float total = kilometros * precio;

        System.out.print("El costo del boleto sera por: "+total+" por "+kilometros+" kilometros");
    }
}
