package com.devsenior.amoreno;

import java.util.Scanner;

public class AreaYPerimetro {
    public static void main(String[] args) {

        int base;
        int altura;
        int area;
        int perimetro;
        System.out.println("ingrese los valores para calcular el area y el perimetro de un rectangulo.");
        System.out.print("ingrese la Base: ");
        Scanner scanner = new Scanner(System.in);
        base = scanner.nextInt();
        System.out.println("La Base es: " + base);
        System.out.print("Ingrese la Altura: ");
        altura = scanner.nextInt();
        System.out.println("La Altura es: " + altura);
        System.out.println("Calculando Area");
        area = base * altura;
        System.out.println("El Area es: " + area);
        System.out.println("Calculando Perimetro");
        perimetro = 2 * (base + altura);
        System.out.println("El Perimetro es: " + perimetro);
        scanner.close();
    }
}
