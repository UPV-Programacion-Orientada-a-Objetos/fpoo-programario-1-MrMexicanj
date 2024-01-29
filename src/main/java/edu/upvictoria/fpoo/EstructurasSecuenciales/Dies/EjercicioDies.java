package edu.upvictoria.fpoo.EstructurasSecuenciales.Dies;

import java.util.Scanner;

public class EjercicioDies {
    public EjercicioDies(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Medicion de telas");
        System.out.print("Ingrese la cantidad de metros: ");
        Float metros = Float.valueOf(entradaTeclado.nextLine());

        Float pulgadas = (float)(39.37/1.0) * metros;

        System.out.print("La cantidad de pulgadas a pedir de tela son: "+ pulgadas);

    }
}
