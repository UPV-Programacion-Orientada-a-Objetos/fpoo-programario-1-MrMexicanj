package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasSecuenciales.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Elija un problema los problemas van del 1 al 24");
         int numeroProblema;

        Scanner numProblema = new Scanner(System.in);
        System.out.println("Ingrese el numero del problema: ");
        numeroProblema = Integer.parseInt(numProblema.nextLine());

        switch (numeroProblema){
            case 1: EjercicioUno uno = new EjercicioUno();
            case 2: EjercicioDos dos = new EjercicioDos();
            case 3: EjercicioTres tres = new EjercicioTres();
            case 4: EjercicioCuatro cuatro = new EjercicioCuatro();
            case 5: EjercicioCinco cinco = new EjercicioCinco();
            case 6: EjercicioSeis seis = new EjercicioSeis();
            case 7: EjercicioSiete siete = new EjercicioSiete();
            case 8: EjercicioOcho ocho = new EjercicioOcho();
            case 9: EjercicioNueve nueve = new EjercicioNueve();
            case 10: EjercicioDies dies = new EjercicioDies();
            case 11: EjercicioOnce once = new EjercicioOnce();
            case 12: EjercicioDoce doce = new EjercicioDoce();
            case 13: EjercicioTrece trece = new EjercicioTrece();
            case 14: EjercicioCatorce catorce = new EjercicioCatorce();
            case 15: EjercicioQuince quince = new EjercicioQuince();
            case 16: EjercicioDieciseis dieciseis = new EjercicioDieciseis();
            case 17: EjercicioDiecisiete diecisiete = new EjercicioDiecisiete();
            case 18: EjercicioDieciocho dieciocho = new EjercicioDieciocho();
            case 19: EjercicioDiecinueve diecinueve = new EjercicioDiecinueve();
            case 20: EjercicioVeinte veinte = new EjercicioVeinte();
            case 21: EjercicioVeintiuno veintiuno = new EjercicioVeintiuno();
            case 22: EjercicioVeintiDos veintiDos = new EjercicioVeintiDos();
            case 23: EjercicioVeintitres veintitres = new EjercicioVeintitres();
            case 24: EjercicioVeinticuatro veinticuatro = new EjercicioVeinticuatro();

        }
    }
}