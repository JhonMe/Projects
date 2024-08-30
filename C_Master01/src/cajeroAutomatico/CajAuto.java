package cajeroAutomatico;

import java.util.Scanner;

public class CajAuto {
    public static void main(String[] args) {
        System.out.println("***BIENVENIDO AL CAJERO AUTOMATICO DE JHON***");
        Scanner opcion = new Scanner(System.in);
        var salir = false;
        var saldoActual = 2000;
        while (!salir){
            System.out.println("""
                    Que operacion dese realisar?
                    1) Consultar saldo
                    2) Retirar 
                    3) Depositar
                    4) Salir
                    Elija una opcion: \s""");
            int elegido = opcion.nextInt();

            switch (elegido){
                case 1-> System.out.println("Su saldo actual es de:"+saldoActual);
                case 2-> {
                    System.out.println("Cuanto desea retirar?:");
                    double val2 = opcion.nextDouble();
                    if (val2<=saldoActual){
                        saldoActual-=val2;
                        System.out.println("Sueldo adtual es de:"+saldoActual);
                    } else {
                        System.out.println("Usted no cuenta con es cantidad de saldo"+saldoActual);
                    }

                }
                case 3-> {
                    System.out.println("Cuanto desea depositar?:");
                    double deposito = opcion.nextDouble();
                    saldoActual+=deposito;
                    System.out.println("Ahora tienes un saldo de:" + saldoActual);
                }
                case 4->{
                    System.out.println("Saliendo del sistema...");
                    salir=true;
                }
                default -> System.out.println("Opcion no valida");
            }
        }
    }
}
