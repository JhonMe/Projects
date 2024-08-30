package JavaPrinc;

import java.util.Scanner;

public class sisCalificacion {
    public static void main(String[] args) {
        System.out.println("Ingrese nota: ");
        Scanner notas = new Scanner(System.in);
        int nota = notas.nextInt();
        if (nota>=9 && nota <=10){
            System.out.println("A");
        } else if (nota >= 8 && nota <9) {
            System.out.println("B");
        } else if (nota >= 7 && nota<8) {
            System.out.println("C");
        } else if (nota>=6 && nota<7) {
            System.out.println("D");
        } else if (nota >= 0 && nota <6) {
            System.out.println("E");
        }
        else {
            System.out.println("Valor desconocido");
        }
    }
}
