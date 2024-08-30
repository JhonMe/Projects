package JavaPrinc;

import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {

        System.out.println("Ingrese el mes actual: ");
        Scanner sc = new Scanner(System.in);
        int mesHoy = sc.nextInt();
        var estacion =  "EstacionDesconocida";

        if (mesHoy == 1 || mesHoy ==2 || mesHoy == 12){
            estacion = "invierno";
        } else if (mesHoy == 3 || mesHoy == 4 || mesHoy==5) {
            estacion = "otoño";
        } else if (mesHoy == 6 || mesHoy == 7 || mesHoy == 8) {
            estacion = "verano";
        } else if (mesHoy == 9 || mesHoy == 10 || mesHoy == 11) {
            estacion ="primavera";
        }
        System.out.println(estacion);
    }
}
