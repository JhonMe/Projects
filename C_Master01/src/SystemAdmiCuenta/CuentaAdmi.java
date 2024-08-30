package SystemAdmiCuenta;

import java.util.Scanner;

public class CuentaAdmi {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        boolean salir = false;
        while (!salir){
            System.out.println("""
                    ***Sistema de Cuenta***
                    1) Crear cuenta 
                    2) Elininar cuenta 
                    3) Salir 
                    Elije una opcion: \s
                    """);
            int Opcion=consola.nextInt();

            switch (Opcion){
                case 1-> System.out.println("Creando sistema...");
                case 2-> System.out.println("Eliminando sitema...");
                case 3->{
                    System.out.println("Sliendo del sistema");
                    salir=true;
                }
                default -> System.out.println("Opcion incorrecta");
            }
        }
    }
}
