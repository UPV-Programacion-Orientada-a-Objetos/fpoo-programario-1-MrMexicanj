package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioDieciseis {
    public EjercicioDieciseis(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Cobro por trabajos de pintura");
        System.out.print("Ingrese los metros cuadrados a pintar: ");
        Float metros = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el precio del metro cuadrado: ");
        Float precio = Float.valueOf(entradaTeclado.nextLine());

        Float total = metros * precio;

        System.out.print("El total a pagar por "+metros+" metros cuadrados es de: $"+total);
    }
}
