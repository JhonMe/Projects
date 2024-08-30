package parImpar;

import java.util.Scanner;

public class WhitScan {
    public static void main(String[] args) {
        System.out.println("**NUMERO IMPAR**");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la catidad Impar:");
        var cantidad = scan.nextInt();
        var total =0;
        while (total<=cantidad){
            if (total %2 !=0){
                System.out.println(total);
            }
            total++;
        }

        //Par de numero
        par();


    }
    public static void par(){
        Scanner sca1 =new Scanner(System.in);
        System.out.println("Ingrese la catidad Par:");
        var cantidad1 = sca1.nextInt();
        var total1 =0;
        while (total1<=cantidad1){
            if (total1 %2 ==0){
                System.out.println(total1);
            }
            total1++;
        }
    }
}
