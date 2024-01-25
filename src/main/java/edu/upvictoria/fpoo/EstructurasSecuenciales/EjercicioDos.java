package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;
public class EjercicioDos {
    public EjercicioDos() {
        Float calUno;
        Float calDos;
        Float calTres;
        Float calCuatro;
        Float calFinal;

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Obtener promedio de calificaciones de 4 examenes");

        System.out.print("Ingrese calificacion del primer examen: ");
        calUno = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese calificacion del segundo examen: ");
        calDos = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese calificacion del tercer examen: ");
        calTres = Float.valueOf(entradaTeclado.nextLine());
        System.out.println("Ingrese calificacion del cuarto examen: ");
        calCuatro = Float.valueOf(entradaTeclado.nextLine());

        calFinal = calUno + calDos + calTres + calCuatro;
        Float calSem = (calFinal) / 4;

        System.out.print("Tu calificacion final es: "+ calSem);
    }
}
