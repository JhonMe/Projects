package ManipulacionArchivo;

import java.util.Scanner;

public class precionVenta {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese valor de venta: ");
        double vv = leer.nextDouble();

        double igv = vv * 0.18;
        double pv = vv * igv;

        System.out.println("El valor de la venta es: " + vv);
        System.out.println("El valor del igv es: "+igv);
        System.out.println("El valor del precio venta es: "+pv);

        /**
         * Uso de breack y continue
         */
        for (int i =0; i<10; i++){
            System.out.println("El valor de i es: "+i);
            if (i==5){
                System.out.println("No me detendre sii ");
                continue; //Continua hata 10 breack rompe solo en 5
            }
            System.out.println("sigo corriendo ");
        }
    }
}
