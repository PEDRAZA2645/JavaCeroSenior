package com.devsenior.amoreno;

import java.util.Scanner;

public class PrecioKilo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gramos = 0;
        double precioEnGramos = 0;

        while (gramos <= 0) {
            System.out.print("Ingrese la porción en gramos del producto: ");
            gramos = scanner.nextInt();

            if (gramos <= 0) {
                System.out.println("La cantidad de gramos debe ser mayor que cero. Inténtelo nuevamente.");
            }
        }

        while (precioEnGramos <= 0) {
            System.out.print("Ingrese el precio equivalente a esa porción: ");
            precioEnGramos = scanner.nextDouble();

            if (precioEnGramos <= 0) {
                System.out.println("El precio debe ser mayor que cero. Inténtelo nuevamente.");
            }
        }

        double precioPorKilo = (precioEnGramos / gramos) * 1000;
        System.out.println("El precio por kilo del producto es: " + precioPorKilo);

        scanner.close();
    }
}