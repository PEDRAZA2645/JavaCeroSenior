package com.devsenior.amoreno;

import java.lang.annotation.ElementType;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        double promedio;
        System.out.println("Ingrese trés numeros para calcular el Promedio");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("El primer numero es: " + num1);
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        System.out.println("El segundo numero es: " + num2);
        System.out.print("Ingrese el tercer numero: ");
        num3 = scanner.nextInt();
        System.out.println("El tercer numero es: " + num3);
        promedio = (double) (num1 + num2 + num3) / 3;
        System.out.println("El Promedio es: " + promedio);
        scanner.close();
    }
}
