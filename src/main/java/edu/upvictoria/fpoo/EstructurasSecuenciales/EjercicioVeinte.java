package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioVeinte {
    public EjercicioVeinte(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Costo por llamada");

        System.out.print("Ingrese el numero de minutos de la llamada: ");
        int tiempo = Integer.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el costo por minuto: ");
        Float costo = Float.valueOf(entradaTeclado.nextLine());

        Float total = tiempo * costo;

        System.out.print("El total a pagar por "+tiempo+" minutos es de $"+total);
    }
}
