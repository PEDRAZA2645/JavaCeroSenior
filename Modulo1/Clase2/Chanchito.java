import java.util.Scanner;

/**
 * Se realizó la instalacion de java en el sistema.
 * Se creó el primer programa en Java que imprime "¡Hola, Mundo!" en la consola
 * @param args
 */
public class Chanchito {
    public static void main(String[] args) {
        System.out.println("¡Hola, Chanchito!");
        System.out.print("Como van las cosas?");//s de String
        System.out.print(10);//i de Integer
        System.out.print(10.5);//d de Double
        System.out.print('A');//c de Char
        System.out.printf("Aquí va una cadena: %s\n", "Hola");//Formato String
        System.out.printf("Aquí va un entero: %d\n", 100);//Formato Integer
        System.out.printf("Aquí va un decimal: %.2f\n", 10.5678);//Formato Double
        System.out.printf("Aquí va un caracter: %c\n", 'Z');//Formato Char

        var entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        var nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);
        System.out.print("Por favor ingrese un numero entero: ");
        var entero = entrada.nextInt();
        System.out.println(entero);
        entrada.close();
    }
}