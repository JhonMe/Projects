package JavaPrinc;

import java.util.Scanner;

public class InfoTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Proporciona el Id: ");
        int Id = sc.nextInt();
        System.out.println("Proporcione el precio: ");
        float precio = sc.nextFloat();
        System.out.println("Ingrese el envio gratuito: ");
        boolean envio = sc.nextBoolean();

        System.out.println(nombre);
        System.out.println(Id);
        System.out.println(precio);
        System.out.println(envio);
    }
}
