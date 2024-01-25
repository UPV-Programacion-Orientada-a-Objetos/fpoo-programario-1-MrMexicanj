package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioCatorce {
    public EjercicioCatorce(){
        Scanner entradaTecaldo = new Scanner(System.in);

        System.out.println("Edad del personal");
        System.out.print("Ingrese el nombre del empleado: ");
        String empleado = String.valueOf(entradaTecaldo.nextLine());
        System.out.print("Ingrese el año de nacimiento: ");
        int nacimiento = Integer.valueOf(entradaTecaldo.nextLine());
        System.out.print("Ingrese el año actual: ");
        int actual = Integer.valueOf(entradaTecaldo.nextLine());

        int edad = actual - nacimiento;

        System.out.print("El empleado "+empleado+ " tiene "+edad+" años");
    }
}
