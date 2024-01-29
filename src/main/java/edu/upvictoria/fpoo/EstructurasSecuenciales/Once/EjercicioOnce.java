package edu.upvictoria.fpoo.EstructurasSecuenciales.Once;

import java.util.Scanner;

public class EjercicioOnce {
    public EjercicioOnce(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Pago en metros cubicos de una alberca");
        System.out.print("Ingrese la medida de lo largo: ");
        Float largo = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese la medida de lo ancho: ");
        Float ancho = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese la profundidad: ");
        Float profundidad = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el valor de los metros cubicos: ");
        Float precio = Float.valueOf(entradaTeclado.nextLine());

        Float volumen = largo * ancho * profundidad;

        Float precioFinal = volumen * precio;

        System.out.print("El pago por "+ volumen +" metros cubicos de agua es de: $"+ precioFinal);
    }
}
