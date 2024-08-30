package Calculadora;

import java.util.Scanner;

public class Cal1 {
    public static void main(String[] args) {
        System.out.println("**BIENVENIDO A CALCULADORA**");
        Scanner opcion =new Scanner(System.in);
        double val1=0, val2 =0, total;
        var salir = false;
        while (!salir){
            System.out.println("""
                    ESCOJE UNA OPCION:
                    1) SUMA
                    2) RESTA
                    3) MULTIPLICACION
                    4) DIVICION
                    5) SALIR
                    """);
            var valor = opcion.nextInt();

            if (valor>=0 && valor<=4){
                System.out.println("Valor 1:");
                val1=opcion.nextDouble();
                System.out.println("Valor 2:");
                val2=opcion.nextDouble();
            }

            switch (valor){
                case 1 -> {
                    total=val1+val2;
                    System.out.println("La suma de"+val2+"+"+val2+"="+total);
                }
                case 2->{
                    total=val1-val2;
                    System.out.println("La suma de"+val2+"-"+val2+"="+total);
                }
                case 3 -> {
                    total=val1*val2;
                    System.out.println("La suma de"+val2+"x"+val2+"="+total);
                }
                case 4->{
                    total=val1/val2;
                    System.out.println("La suma de"+val2+"/"+val2+"="+total);
                }
                case 5->{
                    System.out.println("Saliendo del sistema...");
                    salir=true;
                }

                default -> System.out.println("Opcion incorrecta");
            }
        }
    }
}
