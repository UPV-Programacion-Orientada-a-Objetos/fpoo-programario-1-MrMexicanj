package edu.upvictoria.fpoo.EstructurasSecuenciales.Seis;

import java.util.Scanner;

public class EjercicioSeis {
    public EjercicioSeis(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Area de figura en forma de cono (medio circulo y dos triangulos)");

        System.out.print("Ingresa el valor de la hipotenusa: ");
        Float valorHipotenusa = Float.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingresa el valor del radio: ");
        Float valorRadio = Float.valueOf(entradaTeclado.nextLine());

        double valorDelCateto = Math.sqrt(Math.pow(valorHipotenusa, 2) - Math.pow(valorRadio, 2));
        double areaTriangulo = (valorDelCateto * valorRadio) / 2;
        double areaDosTriangulos = areaTriangulo + areaTriangulo;
        double areaDelCirculo = (float) 3.1416 * Math.pow(valorRadio,2);
        double areaDeMedioCirculo = areaDelCirculo / 2;
        double areaFinal = areaDeMedioCirculo + areaDosTriangulos;

        System.out.print("El area total es: "+areaFinal+ " m/cm cuadrados");



    }
}
