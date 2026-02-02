package com.devsenior.amoreno;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        System.out.println("por favor ingrese dos numeros enteros");
        Scanner scanner = new Scanner(System.in);
        System.out.print("numero uno: ");
        num1 = scanner.nextInt();
        System.out.print("numero dos: ");
        num2 = scanner.nextInt();
        System.out.println("los numeros Elegidos son: " + num1 + " y " + num2);
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        resta = num1 - num2;
        System.out.println("La resta es: " + resta);
        multiplicacion = num1 * num2;
        System.out.println("la multiplicación es: " + multiplicacion);
        division = num1 / num2;
        System.out.println("La División es: " + division);
        scanner.close();
    }
}
