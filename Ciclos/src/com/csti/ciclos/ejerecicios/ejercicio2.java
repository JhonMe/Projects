package com.csti.ciclos.ejerecicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        float [] Almacen = new float[4];
        Scanner sc=new Scanner(System.in);
        float suma1 = 0;
        float Promedio1=0;
        for (int i=0; i<Almacen.length; i++){
            System.out.println("Ingrese la nota: "+i);
            Almacen[i]= sc.nextFloat();
        }
        for (float rs : Almacen){
             suma1 += rs;
        }

        Promedio1 = suma1/Almacen.length;
        System.out.println("Tu promedio es el siguiente: "+Promedio1);
    }
}
