package edu.upvictoria.fpoo.EstructurasSecuenciales.Trece;

import java.util.Scanner;

public class EjercicioTrece {
    public EjercicioTrece(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Dolares a pesos Mx");

        System.out.print("Ingrese la cantida de dolares: ");
        int dolares = Integer.parseInt(entradaTeclado.nextLine());
        System.out.print("Ingrese el precio del peso Mx: ");
        Float pesos = Float.valueOf(entradaTeclado.nextLine());

        Float convertir = dolares * pesos;

        System.out.print("$"+dolares+" Dolares equivalen a: $"+convertir+" Pesos Mexicanos");

    }
}
