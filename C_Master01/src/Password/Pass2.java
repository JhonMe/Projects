package Password;

import java.util.Scanner;

public class Pass2 {
    public static void main(String[] args) {
        System.out.println("**VALIDADOR DE PASSWORD**");
        Scanner password =new Scanner(System.in);
        System.out.print("Ingrese pass de 5 caracteres:");
        var pass =password.nextLine();
        while (pass.length()<5){
            System.out.println("El pass es muy corta");
            System.out.print("Ingrese una nueva pass:");
            pass=password.nextLine();
        }
        System.out.println("El pass es valido crack");
    }
}
