package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioVeintitres {
    public EjercicioVeintitres(){
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ahorro de dinero");
        System.out.print("Ingrese el sueldo: ");
        double sueldo = Double.valueOf(entradaTeclado.nextLine());

        double ahorroSemanal = sueldo * 0.15;
        double ahorroMensual = sueldo * (0.15 * 4);
        double ahorroAnual = sueldo * (0.15 * 4 * 12);

        System.out.println("El ahorro semanal es de: "+ahorroSemanal);
        System.out.println("El ahorro mensual es de: "+ahorroMensual);
        System.out.println("El ahorro anual es de: "+ahorroAnual);

    }
}
