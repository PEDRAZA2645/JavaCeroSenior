package com.devsenior.amoreno;

import java.util.List;
import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor digite un numero: ");
        long numero = scanner.nextLong();
        long count = 0;
        if(numero <= 99) {
            for (long i = 0; i <= numero; i++) {
                String iString = String.valueOf(i);
                count += iString.chars().filter(ch -> ch == '1').count();

            }
            if (numero > 99 && numero <= 199) {
                for (long i = 100; i <= numero; i++) {
                    String iString = String.valueOf(i);
                    count += iString.chars().filter(ch -> ch == '1').count();
                }
            }
        }
        System.out.println("El numero de veces encontrado es: " + count);

    }
}
