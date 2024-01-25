package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioUno {
    public EjercicioUno() {
        Float primero;
        Float segundo;
        Float respuesta;

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Suma de 2 numeros");

        System.out.print("Ingrese el primer numero: ");
        primero = Float.valueOf(entradaTeclado.nextLine());

        System.out.print("Ingrese el segundo numero: ");
        segundo = Float.valueOf(entradaTeclado.nextLine());

        respuesta = primero + segundo;

        System.out.print("La respuesta es: "+ respuesta);

    }
}
