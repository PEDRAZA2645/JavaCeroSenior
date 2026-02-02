package com.devsenior.amoreno;

public class CostoOrdenador {
    public static void main(String[] args) {
        int costo = 660;
        int descuento = 10;
        int totalPAgar = costo - (costo * descuento / 100);
        System.out.println("El total a pagar es: " + totalPAgar);
    }
}
