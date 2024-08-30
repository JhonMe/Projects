package Password;

import java.util.Scanner;

public class password1 {
    public static void main(String[] args) {
        Scanner passIn = new Scanner(System.in);
        System.out.println("Ingrese el password (de al menos 6 meses):");
        var pass =passIn.nextLine();
        while (pass.length()<6){
            System.out.println("El pass es invalido");
            System.out.println("Ingresa nuevamente el Pass valido:");
            pass=passIn.nextLine();

        }
        System.out.println("El pass es valido");
    }
}
