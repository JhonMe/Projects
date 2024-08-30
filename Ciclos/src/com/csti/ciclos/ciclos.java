package com.csti.ciclos;

public class ciclos {
    public static void main(String[] args) {
        System.out.println("Ciclo While");
        int i = 0;
        //ciclo While
        while( i <= 5 ){
            System.out.println("El valor de i es: " + i);
            i++;
        }
        //ciclo do while
        System.out.println("Ciclo Do While");
        i=0;
        do {
            System.out.println("El valor de i es: " + i);
            i++;
        } while (i < 5);

        //for
        System.out.println("Este es el ciclo For");
        for (int j=0; j<5; j++){
            System.out.println("El valor de J es: " +j);
        }

        //Ciclo For
        System.out.println("Este es el ciclo Forech");
        String[] values= {"M","end","ozaJ"};
        for (int a = 0; a<values.length; a++){
            System.out.println(values[a]);
        }
        //Forech
        for (String Rps : values) {
            System.out.println(Rps);
        }
    }
}
