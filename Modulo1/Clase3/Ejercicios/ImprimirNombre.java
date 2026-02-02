package com.devsenior.amoreno;

import java.util.Scanner;

public class ImprimirNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Su nombre es: " + nombre);
        System.out.print("Ingrese su segundo nombre: ");
        String segundoNombre = scanner.nextLine();
        System.out.println("Su segundo nombre es: " + segundoNombre);
        System.out.print("ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Su apellido es: " + apellido);
        System.out.print("Ingrese su segundo apellido: ");
        String segundoApellido = scanner.nextLine();
        System.out.println("Su segundo apellido es: " + segundoApellido);
        System.out.println("Su nombre completo es: " + nombre + " " + segundoNombre + " "
                + apellido + " " + segundoApellido );
        scanner.close();
    }
}
