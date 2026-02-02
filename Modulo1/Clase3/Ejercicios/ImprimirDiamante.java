package com.devsenior.amoreno;

public class ImprimirDiamante {
    public static void main(String[] args) {
        System.out.println("Diamante 1\n");
        String diamante1 = """
           *   
          ***  
         ***** 
        *******
         ***** 
          ***  
           * 
        """;
        System.out.println(diamante1);
        System.out.println("");
        System.out.println("Diamante 2\n");
        System.out.println("""
            /\\
           /  \\
          /    \\
         /------\\
         \\------/
          \\    /
           \\  /
            \\/
        """);
    }
}
