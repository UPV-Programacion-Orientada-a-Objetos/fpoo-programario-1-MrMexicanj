package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioDiecinueve {
    public EjercicioDiecinueve(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Tiempo en llegar a una ciudad a otra en bici");
        System.out.print("Ingrese la distancia: ");
        Float distancia = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese la velocidad constante: ");
        int velocidad = Integer.valueOf(entradaTeclado.nextLine());

        Float tiempo = distancia / velocidad;

        System.out.print("El tiempo por "+distancia+" kilometros recorridos es de "+tiempo+" horas");

    }
}
