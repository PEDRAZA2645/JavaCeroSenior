package com.devsenior.amoreno;

public class PrecioSinDescuento {
    public static void main(String[] args) {
        int totalPagado = 34;
        double descuento = 15;
        descuento = (100 - descuento) / 100;
        System.out.println("el porcentaje full es: " + descuento);
        double costofull = (totalPagado / descuento);
        System.out.println("El precio sin descuento es: " +costofull);
    }
}
