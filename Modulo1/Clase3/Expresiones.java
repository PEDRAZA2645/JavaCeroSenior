package Clase3;

public class Expresiones {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double -> String
        // var num1 = '1' + '0'; // This evaluates to 49 + 48 = 97 (ASCII values)
        var num1 = 10;
        System.out.println(num1);
        var num2 = -5;
        var num3 = num1 + num2;
        var num4 = 40 - num3;
        System.out.println(num3);
        var num5 = 10d *25 - 30 / 8; //se realiza primero la multiplicación, división  módulos de izquierda a derecha
        System.out.println(num5);
        var num6 = 157 / 11;
        var num7 = 7 %2;
        System.out.printf("la división entre 7 y 2 es %d y el módulo es %d%n", num6, num7);
        //++num incremento, --num decremento despues uso el número
        ++num6; //num6 = num6 + 1;
        --num6; //num6 = num6 - 1;
        //num++ incremento, num-- decremento antes de usar el número
        num6++; //num6 = num6 + 1;
        num6--; //num6 = num6 - 1;
        //la diferencia entre preincremento y postincremento es el orden en que se evalúa la expresión
        var num8 = 10;;
        var num9 = 5;
        var num10 = num8++ - --num9; //num10 = 10 - 4 = 6 num8 = 11 num9 = 4
        System.out.println(num10);

        num8 = 26;
        num9 = 18;
        var num11 = ++num8 - num9--; //num11 = 27 - 18 = 9 num8 = 27 num9 = 17
        System.out.println(num11);
        System.out.println(num8);
        System.out.println(num9);

        var num12 = 30;
        num12 *= 7; //num12 = num12 * 7;
        System.out.println(num12);

        num12 %= 2;
        System.out.println(num12);
    }

}
