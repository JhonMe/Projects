package ManipulacionArchivo;

import java.util.Scanner;

public class MulCondiciones {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una vocal: ");
        String v = read.nextLine();

        if (v == "a" || v== "A"){
            System.out.printf("%s Es una vocal\n", v);
        } else if (v == "e"|| v=="E") {
            System.out.printf("%s Es una vocal\n", v);
        } else if (v == "i"|| v=="I") {
            System.out.printf("%s Es una vocal\n", v);
        } else if (v == "o"|| v=="O") {
            System.out.printf("%s Es una vocal\n", v);
        } else if (v == "u"|| v=="U") {
            System.out.printf("%s Es una vocal\n", v);
        } else {
            System.out.printf("%s No es una Vocal\n", v);
        }
    }
}
