package edu.upvictoria.fpoo.EstructurasSecuenciales.Tres;

import java.util.Scanner;
public class EjercicioTres {
    public EjercicioTres(){
        Scanner entradaTeclado = new Scanner(System.in);
        Float base;
        Float altura;

        System.out.println("Area de un rectangulo");

        System.out.print("Ingrese el valor de la base del rectangulo: ");
        base = Float.valueOf(entradaTeclado.nextLine());

        System.out.print("Ingrese el valor de la altura del rectangulo: ");
        altura = Float.valueOf(entradaTeclado.nextLine());

        Float area = base * altura;
        Float respuesta = area;

        System.out.println("El area del rectangulo es: "+respuesta+ " cm cuadrados");
    }
}
