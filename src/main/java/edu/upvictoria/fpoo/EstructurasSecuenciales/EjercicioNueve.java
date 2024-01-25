package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioNueve {
    public EjercicioNueve(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Sueldo semanal");
        System.out.print("Ingrese el numero de horas: ");
        Float horas = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el pago por hora: ");
        Float pagoHoras = Float.valueOf(entradaTeclado.nextLine());

        Float pagoFinal = horas * pagoHoras;

        System.out.print("Su sueldo final es: "+ pagoFinal);

    }
}
