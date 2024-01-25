package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioQuince {
    public EjercicioQuince(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Cobro de estacionamiento");
        System.out.print("Ingrese precio de la hora: ");
        Float precio = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el numero de horas: ");
        int hora = Integer.valueOf(entradaTeclado.nextLine());
        System.out.print("Hubo fraccion de hora? ");
        String fraccion = String.valueOf(entradaTeclado.nextLine());

        if(fraccion.equals("si")){
            int cobroMashora = hora +1 ;
            Float cobro1 = cobroMashora * precio;
            System.out.print("Cobro por "+hora+" horas es de "+cobro1);
        }
        if(fraccion.equals("no")){
                Float cobro2 = precio * hora;
                System.out.print("Cobro por "+hora+" horas es de "+cobro2);
        }
    }
}
