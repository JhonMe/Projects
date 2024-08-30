package JuegoAdivinanza;

import java.util.Random;
import java.util.Scanner;

public class PlayQuiz1 {
    public static void main(String[] args) {
        System.out.println("**PLAY QUIZ**");
        Scanner eleccion = new Scanner(System.in);
        var ramdon = new Random();

        var numeroOCU = ramdon.nextInt(10)+1;
        var intento =0;
        var adivinanza =0;
        var limite  = 5;

        while (adivinanza != numeroOCU && intento < limite){
            System.out.println("ingrese nuevo ");
            adivinanza = eleccion.nextInt();
            if (adivinanza<numeroOCU){
                System.out.println("Ingrese uno que sea mayor");
            }
            else {
                System.out.println("Ingrese un numero menor");
            }
            intento++;
        }
        if (adivinanza==numeroOCU){
            System.out.println("Exelente adivinaste el numero:"+numeroOCU);
        }
        else {
            System.out.println("Termiaste el intento el numero secreto es:"+numeroOCU);
        }


    }
}
