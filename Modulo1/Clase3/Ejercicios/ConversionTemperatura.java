package com.devsenior.amoreno;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        int celsius;
        int fahrenheit;
        double kelvin;
        System.out.print("Ingrese la Temperatura en grados Celsius: ");
        Scanner scanner = new Scanner(System.in);
        celsius = scanner.nextInt();
        System.out.println("la temperatura seleccionada es: " + celsius + "°C");
        System.out.println("Calculando Temperatura en grados Fahrenheit");
        fahrenheit = celsius * 9/5 + 32;
        System.out.println("La Temperatura es: " + fahrenheit + "°F");
        System.out.println("Calculando Temperatura en grados Kelvin");
        kelvin = celsius + 273.15;
        System.out.println("La Temperatura es: " + kelvin + "K");
        scanner.close();
    }
}
