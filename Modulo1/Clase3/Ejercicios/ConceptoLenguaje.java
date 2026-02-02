package com.devsenior.amoreno;

public class ConceptoLenguaje {
    public static void main(String[] args) {
        int nEst;
        double sMens;
        boolean esAct;
        String fullName;
        float tempAct;
        char initlastName;
        long phoneNumber;
        byte age;
        short cantProduct;
        boolean tienePermiso;

        System.out.println("Segunda parte");
        int a = 10;
        int b = 5;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        a += 3;
        b *= 2;

        a++;
        b--;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        System.out.println("a después de += 3: " + a);
        System.out.println("b después de *= 2: " + b);
        System.out.println("a después de ++: " + a);
        System.out.println("b después de --: " + b);

        System.out.println("Tercera parte");
        int c = 10;
        int d = 20;
        c = d + 5;
        System.out.println("El valor de a es: " + c);

        c += 10;
        System.out.println("El valor de a es: " + c);
        var ejercicio1 = 16 + 3 * (6 - 4) - 3 * 5;
        System.out.print("Ejercicio 1: " + ejercicio1 + "\n");
        var ejercicio2 = 23 - 8 + 6 * 2 - 3 * 4;
        System.out.print("Ejercicio 2: " + ejercicio2 + "\n");
        var ejercicio3 = 6 * (7 * 5 - 4 * 6) + 81 / 9 - 6;
        System.out.print("Ejercicio 3: " + ejercicio3 + "\n");
        var ejercicio4 = 6 * 4 + 3 * (450 / 10 - 5 * (3 + 2));
        System.out.print("Ejercicio 4: " + ejercicio4 + "\n");
        var ejercicio5 = 5 * 6 / 2 - (12 - 3) * 2;
        System.out.print("Ejercicio 5: " + ejercicio5 + "\n");
    }

}
