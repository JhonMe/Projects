package com.csti.ciclos;

public class ManejoString {
    public static void main(String[] args) {
        String ma = "Hola Mundo";
        int rec = ma.length();
        char cha = ma.charAt(0);
        int in = ma.indexOf("l");
        String s2 = ma.substring(0,4);
        String  s1= ma.substring(4);
        System.out.println("La longitud es: "+rec);
        System.out.println("El char es: "+cha);
        System.out.println("El index of es: "+in);
        System.out.println("El sub  string es: "+s2);
        System.out.println("Es "+s1);
    }
}
