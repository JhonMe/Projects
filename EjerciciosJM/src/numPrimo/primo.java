package numPrimo;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        System.out.println("**NUMERO PRIMO**");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        var valor =sc.nextInt();
        var isPrimo =true;
        for (int i=2; i<=valor/2; i++){
            if (valor % i==0){
                isPrimo=false;
                break;
            }
        }
        if (isPrimo){
            System.out.println("Es primo:"+valor);
        }
        else {
            System.out.println("No es primo:"+valor);
        }
    }
}
