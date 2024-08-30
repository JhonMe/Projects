package Calculadora;

import java.util.Scanner;

public class cla3 {
    public static void main(String[] args) {
        var salir = false;
        Scanner sacn = new Scanner(System.in);
        double val1=0, val2=0;
        while (!salir){
            System.out.println("""
                QUE DESEAS HACER HOY?
                1) SUMA
                2) RESTA
                3) MULTIPLICACION
                4) DIVICION
                5) SALIR
                """);

            int opcion =sacn.nextInt();
            if (opcion<=0&&opcion>=6){
                System.out.println("Ingrese el primer valor");
                 val1 = sacn.nextDouble();
                System.out.println("Ingrese el segundo valor");
                 val2 = sacn.nextDouble();
            }
            switch (opcion){
                case 1 -> System.out.println("La suma es:"+(val1+val2));
                case 2 -> System.out.println("La resta es:"+(val1-val2));
                case 3 -> System.out.println("La multiplicacion es:"+(val1*val2));
                case 4 -> System.out.println("La divicion es:"+(val1/val2));
                case 5 ->{
                    salir=true;
                    System.out.println("Saliendo del sistema...");
                }
            }
        }
    }
}
