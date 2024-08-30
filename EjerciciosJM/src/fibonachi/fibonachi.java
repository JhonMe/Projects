package fibonachi;

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cuanto numeros fibonachi quieres ver:");
        int dato = sc.nextInt();
        int a=0, b=1;
        System.out.println(a+" "+b);
        for (int i=2; i<dato; i++) {
          int resul = a+b;
            System.out.println("Valor:"+resul);
            a=b;
            b=resul;
        }
    }
}
