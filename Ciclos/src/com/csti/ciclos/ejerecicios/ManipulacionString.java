package com.csti.ciclos.ejerecicios;

public class ManipulacionString {
    public static void main(String[] args) {
        String letra = "Hola Mundo";

        String r1 = new String(letra);
        String r2 = r1.concat("A esta progranacion"); //Concatena
        String r3 = r1.toLowerCase(); //combierte todo en miniscula
        String r4 = r1.toUpperCase();//combierte todo en mayuscula
        String r5 = r1.replace("Hola Mundo","Hola Peru");
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(letra.isEmpty()); //Inspecciona si hay valor dentro
        System.out.println(letra.contains("Hola")); //Ve si existe esa palabra

    }
}
