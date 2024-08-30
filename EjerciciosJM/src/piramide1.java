import java.util.Scanner;

public class piramide1 {
    public static void main(String[] args) {
        System.out.println("**PIRAMIDE TRIANGULO**");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad:");
        var cant = sc.nextInt();
        for (int i =1; i<=cant; i++){
            var espacio = " ".repeat(cant-i);
            var asterisco = "*".repeat(2*i-1);
            System.out.println(espacio+asterisco);
        }
    }
}
