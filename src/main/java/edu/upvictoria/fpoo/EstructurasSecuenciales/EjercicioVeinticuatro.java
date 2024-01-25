package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.util.Scanner;

public class EjercicioVeinticuatro {
    public EjercicioVeinticuatro(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Monto de un cheque de viaje");
        System.out.print("Ingrese el numero de dias: ");
        int dias = Integer.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el precio por dia del hotel: ");
        int hotel = Integer.valueOf(entradaTeclado.nextLine());
        System.out.print("Ingrese el gasto por dia de la comida: ");
        int comida = Integer.valueOf(entradaTeclado.nextLine());

        int costoPorDia = dias * 100;
        int costoHotel = hotel * dias;
        int costoComida = comida * dias;
        int total = costoPorDia + costoHotel + costoComida;

        System.out.println("El monto de $100 por "+dias +" dias es de $"+costoPorDia);
        System.out.println("El costo del hotel por "+dias+ " de dias es de $"+costoHotel);
        System.out.println("El costo de la comida por "+dias+ " de dias es de $"+costoComida);
        System.out.println("El costo total de viaje por "+dias+" dias es de $"+total);
    }
}
