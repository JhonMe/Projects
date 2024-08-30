package com.csti.ciclos.ejerecicios;

import java.util.Scanner;

public class Ejercicios {
    //solicitar y alamcenar informacion de las 5 materias
    //sumar el total de calificaciones
    //obtener el promedio
    public static void main(String[] args) {
        float[] calificaiones= new float [5];
        Scanner cur = new Scanner(System.in);
        float suma=0;
        float promedio=0;

        for (int i=0; i<calificaiones.length; i++ ){
            System.out.println("Ingresa su nota "+(i+1));
            calificaiones[i]= cur.nextFloat();
        }
        for (float f : calificaiones){
            suma += f;
            System.out.println(suma);
        }
        promedio=suma/calificaiones.length;
        System.out.println("el promedio es: "+promedio);
    }
}
