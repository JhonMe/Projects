package com.csti.ciclos;

import java.util.Random;
import java.util.Scanner;

public class Ramdon1 {
    public static void main(String[] args) {
        Random r = new Random();
        int rd = r.nextInt(11);
        Scanner sc = new Scanner(System.in);
        int NumUser = -1;
        int intento = 3;
        System.out.println(rd);
        while (NumUser != rd){
            System.out.println("Ingrese el numero de 0 al 10: ");
            NumUser = sc.nextInt();
            if (NumUser!= rd){
                intento--;
                System.out.println("fallaste en el intento, te queda "+intento);
                if (intento==0){
                    System.out.println("Fallate");
                    System.out.println("El numero que eleji es: "+rd);
                    break;
                }
            }
            else {
                System.out.println("Felicidades Ganaste :)");
            }
        }
    }
}
