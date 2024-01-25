package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioDiecisiete {
    public EjercicioDiecisiete(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Hipotenusa de un triangulo");
        System.out.print("Ingrese el valor de  A: ");
        int a = Integer.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el valor de B: ");
        int b = Integer.valueOf(entradaTeclado.nextLine());

        int hipo = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.print("El valor de la Hipotenusa es: "+hipo);
    }
}
