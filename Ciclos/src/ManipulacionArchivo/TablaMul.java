package ManipulacionArchivo;

import java.util.Scanner;

public class TablaMul {
    /**
     * multiplicacion con while con scaner
     */
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int lt = ta.nextInt();
        System.out.println("======Welcome to calculator======");
        int c = 0;
        while (c <= 12){
            System.out.printf("%d x %d = %d\n", lt, c, (c*lt));
            c++;
        }
        para();
    }

    /**
     * multiplicacion con for
     */
    public static void para() {
        int n = 7;

        for (int i = 0; i<=12; i++){
            System.out.printf("%d x %d = %d\n", n,i,(n*i));
        }
    }
}
