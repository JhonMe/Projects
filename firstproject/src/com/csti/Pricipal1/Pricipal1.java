package com.csti.Pricipal1;

import java.util.Scanner;

import com.csti.calculadora1.calculadora1;

public class Pricipal1 {
    public static void main(String[] args) {
        System.out.println("*****Calculadora*****");
        Scanner bun = new Scanner(System.in);
        float num3;
        float num4;
        System.out.println("Ingrese primer numero: ");
        num3 = bun.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        num4 = bun.nextFloat();

        //llamando al metodo calculadora desde pricipal
        /*este un objeto*/     /*este un constructor*/
        calculadora1 cal1 = new calculadora1();
        //Accedemos al metodo suma desde pricipal
        float ResultadoS = cal1.operacionSuma(num3, num4);
        float ResultadoR = cal1.operacionResta(num3, num4);
        float ResultadoM = cal1.operacionMulti(num3, num4);
        float ResultadoD = cal1.operacionDivicion(num3, num4);
        cal1.menu();
        int opcion = bun.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma es el siguiente:" + ResultadoS);
                break;
            case 2:
                float resta = num3 - num4;
                System.out.println("La resta es:" + ResultadoR);
                break;
            case 3:
                float multi = num3 * num4;
                System.out.println("La multiplicacion es el siguiente: " + ResultadoM);
                break;
            case 4:
                float divi = num3 / num4;
                System.out.println("La divicion es: " + ResultadoD);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
