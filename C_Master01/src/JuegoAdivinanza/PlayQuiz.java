package JuegoAdivinanza;

import java.util.Random;
import java.util.Scanner;

public class PlayQuiz {
    public static void main(String[] args) {
        System.out.println("**Juego con numero ramdon**");
        Scanner ran = new Scanner(System.in);
        var ramdon = new Random();

        var numeroSecreto = ramdon.nextInt(50)+1;

        var intentos =0;
        var adivinanza=0;
        var INTENTOS_MAX=5;

        while (adivinanza!=numeroSecreto && intentos<INTENTOS_MAX){
            System.out.println("Ingrese el numero secreto:");
            adivinanza =ran.nextInt();
            if (adivinanza<numeroSecreto){
                System.out.println("Ingresaste un numero menor");
            }else {
                System.out.println("Ingresaste un numero mayor");
            }
            intentos++;

        }
        if (adivinanza==numeroSecreto){
            System.out.println("Lograste adivinar muy bien");
        }else {
            System.out.println("Agotaste el intento");
        }
    }
}
