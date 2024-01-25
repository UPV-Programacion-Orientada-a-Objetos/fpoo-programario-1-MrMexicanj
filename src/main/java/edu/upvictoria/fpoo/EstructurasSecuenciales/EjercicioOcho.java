package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioOcho {
    public EjercicioOcho(){
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Disntancia entre dos puntos");

        System.out.print("Ingrese el valor de la cordenada x1: ");
        int cordenadaXuno = Integer.parseInt(entradaTeclado.nextLine());
        System.out.print("Ingrese el valor de la cordenada y1: ");
        int cordenadaYuno = Integer.parseInt(entradaTeclado.nextLine());
        System.out.print("Ingrese el valor de la cordenada x2: ");
        int cordenadaXdos = Integer.parseInt(entradaTeclado.nextLine());
        System.out.print("Ingrese el valor de la cordenada y2: ");
        int cordenadaYdos = Integer.parseInt(entradaTeclado.nextLine());

        int valorDeX = (int) Math.pow(cordenadaXuno - cordenadaXdos, 2);
        int valorDeY = (int) Math.pow(cordenadaYuno - cordenadaYdos, 2);
        int distancia = (int) Math.sqrt(valorDeX + valorDeY);

        System.out.print("La Distancia es: "+ distancia);
    }
}
