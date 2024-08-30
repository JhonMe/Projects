package DibujoTriangulo;

import java.util.Scanner;

public class DibuTri {
    public static void main(String[] args) {
        System.out.println("***DIBUJO DE TRIANGULO***");
        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese la cantidad:");
        var cant = num.nextInt();
        for (var fila=1; fila <= cant; fila++){
            var espacioBlanco= " ".repeat(cant-fila);
            var asterisco = "*".repeat(2*fila-1);
            System.out.println(espacioBlanco+asterisco);
        }

        //con while
        System.out.println("Ingrese el numero:");
        var cantidad =num.nextInt();
        for (var filas=1; filas<=cantidad; filas++){
            var espBlanco = " ".repeat(cantidad-filas);
            var asterisco ="*".repeat(2*filas-1);
            System.out.println(espBlanco+asterisco);
        }

    }
}
