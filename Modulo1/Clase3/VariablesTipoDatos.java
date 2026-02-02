package Clase3;

import java.util.Scanner;

public class VariablesTipoDatos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingresa un valor:");
        var text = scanner.nextLine();
        System.out.printf("El valor ingresado fue: %s%n", text);
        scanner.close();

        //Boolean
        boolean active;
        var defaultValue = false;
        //Integer numbers
        byte numberByte;
        short numberShort;
        int numberInt;
        long numberLong;
        var numberDefault = 127;
        var bigNumber = 385_475_245_125L;
        //Float numbers
        float numberFloat;
        double numberDouble;
        var temperature = 0.0f;
        var price = 25l;

        // byte -> short -> int -> long -> float -> double -> String

        //Character
        var letter = 'A'; //Latin ASCII tabla de mapeo de caracteres 256 caracteres impriminbles maquina de escribir (1bye)
        var letter2 = '\t'; //tabulador
        var unicodeChar = '\u0041'; //UNICODE (2 bytes)
        
        //String
        String stringValue; 
        var myName = "Andrés Moreno Pedraza";
        System.out.printf("name: %s%d%n", myName, 10);

        }
    }