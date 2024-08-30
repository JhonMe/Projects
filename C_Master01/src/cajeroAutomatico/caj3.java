package cajeroAutomatico;

import java.util.Scanner;

public class caj3 {
    public static void main(String[] args) {
        System.out.println("**Bienvenido al cajero Automatico**");
        double saldoActual = 1000;
        var salir = false;
        Scanner Opcion = new Scanner(System.in);

        while (!salir){
            System.out.println("""
                QUE OPERACION REALIZARAS HOY:
                1) CONSULTA SALDO 
                2) RETIRO
                3) DEPOSITO
                4) SALIR """);
            int Elegido =Opcion.nextInt();
            switch (Elegido){
                case 1-> System.out.println("Su saldo actual es de:"+saldoActual);
                case 2-> {
                    System.out.println("Cuando desea retirar?");
                    double retiro = Opcion.nextDouble();
                    saldoActual-=retiro;
                    System.out.println("Su saldo actual es de:"+saldoActual);
                }
                case 3->{
                    System.out.println("Cuanto desea depositar:");
                    double  deposito = Opcion.nextDouble();
                    saldoActual+=deposito;
                    System.out.println("Ahora tienes un total de:"+saldoActual);
                }
                case 4->{
                    System.out.println("SALIENDO DEL SISTEMA...");
                    salir=true;
                }
            }
        }
    }
}
