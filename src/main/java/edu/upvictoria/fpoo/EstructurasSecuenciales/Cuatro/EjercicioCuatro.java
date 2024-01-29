package edu.upvictoria.fpoo.EstructurasSecuenciales.Cuatro;

import java.util.Scanner;

public class EjercicioCuatro {
    public EjercicioCuatro(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Area de un circulo");

        System.out.print("Ingrese el radio del circulo: ");
        Float radio = Float.valueOf(entradaTeclado.nextLine());

        Float area = (float) (3.1416 * (radio * radio));
        Float respuesta = area;

        System.out.print("El Area del circulo es: "+respuesta);
    }
}
