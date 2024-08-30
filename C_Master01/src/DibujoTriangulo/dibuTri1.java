package DibujoTriangulo;

import java.util.Scanner;

public class dibuTri1 {
    public static void main(String[] args) {
        System.out.println("**DIBUJO DE TRIANGULO**");
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cantidad:");
        var contidad = scan.nextInt();
        for (int fila = 1; fila<=contidad; fila++){
            var espacioBlanco = " ".repeat(contidad-fila);
            var asterisco = "*".repeat(2*fila-1);
            System.out.println(espacioBlanco+asterisco);
        }
    }
}
