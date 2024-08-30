package ManipulacionArchivo;

import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        numero();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String Nombre = sc.nextLine();
        System.out.println("Cual es su edad?: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese un caracter");
        char c = sc.next().charAt(0);

        System.out.println("Tu nombre es: "+Nombre + " y tu edad es: "+edad +" El caracter es: "+c);

    }

    public static void numero(){
            int a = 2;
            int b = 3;

            int f = 7;
            int d = 3;
            if (a <= b || f <= d){
                System.out.println("Es mayor que ");
            }else {
                System.out.println("Es menor");
            }
            int i = 0;
            while (i<5){
                System.out.println("El valor de i es: "+i);
                i++;
            }
            for (int c =0; c<6; c++){
                System.out.println("El numero es: "+c);
            }

            int sw=6;
            switch (sw){
                case 1:
                    System.out.println(" Es uno");
                    break;
                case 5:
                    System.out.println("Es Cinco");
                    break;
                case 6:
                    System.out.println("Es 6");
                    break;
                default:
                    System.out.println("no es ninguno");
                    break;
            }
    }
}
