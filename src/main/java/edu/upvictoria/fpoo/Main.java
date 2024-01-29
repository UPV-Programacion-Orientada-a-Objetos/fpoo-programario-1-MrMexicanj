package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasSecuenciales.Catorce.EjercicioCatorce;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Cinco.EjercicioCinco;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Cuatro.EjercicioCuatro;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Diecinueve.EjercicioDiecinueve;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Dieciocho.EjercicioDieciocho;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Dieciseis.EjercicioDieciseis;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Diecisiete.EjercicioDiecisiete;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Dies.EjercicioDies;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Doce.EjercicioDoce;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Dos.EjercicioDos;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Nueve.EjercicioNueve;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Ocho.EjercicioOcho;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Once.EjercicioOnce;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Quince.EjercicioQuince;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Seis.EjercicioSeis;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Siete.EjercicioSiete;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Trece.EjercicioTrece;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Tres.EjercicioTres;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Uno.EjercicioUno;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Veinte.EjercicioVeinte;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Veinticuatro.EjercicioVeinticuatro;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Veintidos.EjercicioVeintiDos;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Veintitres.EjercicioVeintitres;
import edu.upvictoria.fpoo.EstructurasSecuenciales.Veintiuno.EjercicioVeintiuno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Elija un problema los problemas van del 1 al 24 (precione 0 para otro problema)");
         int numeroProblema;

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese el numero del problema: ");
        numeroProblema = Integer.parseInt(entradaTeclado.nextLine());


        switch (numeroProblema){
            case 1: EjercicioUno uno = new EjercicioUno();
                break;
            case 2: EjercicioDos dos = new EjercicioDos();
                break;
            case 3: EjercicioTres tres = new EjercicioTres();
                break;
            case 4: EjercicioCuatro cuatro = new EjercicioCuatro();
                break;
            case 5: EjercicioCinco cinco = new EjercicioCinco();
                break;
            case 6: EjercicioSeis seis = new EjercicioSeis();
                break;
            case 7: EjercicioSiete siete = new EjercicioSiete();
                break;
            case 8: EjercicioOcho ocho = new EjercicioOcho();
                break;
            case 9: EjercicioNueve nueve = new EjercicioNueve();
                break;
            case 10: EjercicioDies dies = new EjercicioDies();
                break;
            case 11: EjercicioOnce once = new EjercicioOnce();
                break;
            case 12: EjercicioDoce doce = new EjercicioDoce();
                break;
            case 13: EjercicioTrece trece = new EjercicioTrece();
                break;
            case 14: EjercicioCatorce catorce = new EjercicioCatorce();
                break;
            case 15: EjercicioQuince quince = new EjercicioQuince();
                break;
            case 16: EjercicioDieciseis dieciseis = new EjercicioDieciseis();
                break;
            case 17: EjercicioDiecisiete diecisiete = new EjercicioDiecisiete();
                break;
            case 18: EjercicioDieciocho dieciocho = new EjercicioDieciocho();
                break;
            case 19: EjercicioDiecinueve diecinueve = new EjercicioDiecinueve();
                break;
            case 20: EjercicioVeinte veinte = new EjercicioVeinte();
                break;
            case 21: EjercicioVeintiuno veintiuno = new EjercicioVeintiuno();
                break;
            case 22: EjercicioVeintiDos veintiDos = new EjercicioVeintiDos();
                break;
            case 23: EjercicioVeintitres veintitres = new EjercicioVeintitres();
                break;
            case 24: EjercicioVeinticuatro veinticuatro = new EjercicioVeinticuatro();
                break;

        }
    }
}