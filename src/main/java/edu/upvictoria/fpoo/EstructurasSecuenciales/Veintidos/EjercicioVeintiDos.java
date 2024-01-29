package edu.upvictoria.fpoo.EstructurasSecuenciales.Veintidos;

import java.util.Scanner;

public class EjercicioVeintiDos {
    public EjercicioVeintiDos(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Articulo con descuento");
        System.out.print("Ingresa el valor del articulo: ");
        Double articulo = Double.valueOf(entradaTeclado.nextLine());

        double descuento20 = articulo * 0.2;
        double precioConDescuento = articulo - descuento20;
        double iva = precioConDescuento * 0.15;
        double total = precioConDescuento * iva;

        System.out.println("valor de IVA: "+iva);
        System.out.println("valor de descuento: "+descuento20);
        System.out.println("valor de precio con descuento: "+precioConDescuento);
        System.out.println("valor de precio final: "+total);
    }
}
