package ramdoonquiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("**NUMERO ADIvINANZA**");
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        var numeroOcuulto = random.nextInt(50)+1;
        var Max_Intento =5;
        var numeroIngresado =0;
        var intento =0;

        while (numeroOcuulto!=numeroIngresado &&  intento<Max_Intento){
            System.out.println("Ingrese el numero:");
            numeroIngresado = sc.nextInt();
            if (numeroIngresado<numeroOcuulto) System.out.println("El numero es Mayor");
            else System.out.println("El numero ingresaado es menor");
            intento++;
        }
        if (numeroIngresado==numeroOcuulto) System.out.println("Exelente adinaste el numero");
        else System.out.println("Terminaste el intento"+numeroOcuulto);

    }
}
