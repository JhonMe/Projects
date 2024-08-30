package ReversaCadena;

import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad:");
        var cant = sc.nextInt();
        for (int i =1; i<=cant; i++){
            var vacio = " ".repeat(cant-i);
            var asterisco ="*".repeat(2*i-1);
            System.out.println(vacio+asterisco);
        }

    }
}
