package com.devsenior.amoreno;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 1;

        int resultadoJava = a / b * (c + b);
        String interpretacion1 = """
                Java realiza división y multiplicación de izquierda a derecha:
                6 / 2 * (1 + 2)
                = 6 / 2 * (3)
                = 3 * 3
                = 9
                """;
        System.out.println("resultado según java: " + resultadoJava);
        int resultadoCalc = a / (b * (c + b));
        String Interpretacion2 = """
                La calculadora cientifica asume que 2 se multiplica automáticamente por el paréntesis:
                6 / (2 * (1 + 2))
                = 6 / (2 * 3)
                = 6 / 6
                = 1
                """;
        System.out.println("Resultado según calculadora científica: " + resultadoCalc);

        System.out.println("\nExplicación:");
        System.out.println(interpretacion1);
        System.out.println(Interpretacion2);
    }
}
