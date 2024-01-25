package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioCinco {
    public EjercicioCinco(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Area de dos figuras (triangulo y rectangulo)");

        System.out.print("Ingrese el valor de A: ");
        Float a = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el valor de B: ");
        Float b = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el valor de C: ");
        Float c = Float.valueOf(entradaTeclado.nextLine());

        Float areaA = a - c;
        Float areaTriangulo = b*areaA / 2;
        Float areaRectangulo = b*c;
        Float areaFinal = areaTriangulo + areaRectangulo;

        System.out.print("El Area del terreno es: "+ areaFinal+ "metros cuadrados");

    }
}
