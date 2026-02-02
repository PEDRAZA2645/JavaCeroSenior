public class App {
    public static void main(String[] args) {
        var edad = 50;
        // if(edad >= 18)
        //     if(edad >= 60) System.out.println("Eres un adulto mayor");
        //     else System.out.println("Eres mayor de edad"); 
        // else System.out.println("Eres menor de edad");

        if(edad >0 && edad <18)
            System.out.println("Eres menor de edad");
        else if(edad >=18 && edad <29 )
            System.out.println("Eres un adulto joven");
        else if(edad >=29 && edad <45)
            System.out.println("Eres un adulto");
        else if(edad >=45 && edad < 60) System.out.println("Ya estas grandecito, sal de la casa de papá y mamá");
        else if (edad >= 60) System.out.println("Eres un adulto mayor");
        else System.out.println("Edad no valida");

        System.out.println("Fin del programa");
    }

}
