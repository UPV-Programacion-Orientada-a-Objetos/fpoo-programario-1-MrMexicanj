package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioDoce {
    public EjercicioDoce(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Area de un triangulo");
        System.out.print("Ingrese la base: ");
        Float base = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingres la altura: ");
        Float altura = Float.valueOf(entradaTeclado.nextLine());

        Float area = (base * altura) /2;

        System.out.print("El area del triangulo es: "+area+" cm/m cuadrados");
    }
}
