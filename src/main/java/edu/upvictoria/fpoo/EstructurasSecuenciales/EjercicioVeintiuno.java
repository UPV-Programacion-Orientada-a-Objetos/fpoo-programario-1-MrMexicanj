package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioVeintiuno {
    public EjercicioVeintiuno(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Pago de luz");
        System.out.print("Ingrese la cantida de Kilowatts (KW): ");
        int kw = Integer.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el costo: ");
        Float precio = Float.valueOf(entradaTeclado.nextLine());

        Float total = kw * precio;

        System.out.print("El pago total por "+kw+" es de $"+total);

    }
}
