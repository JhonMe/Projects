package JavaPrinc;

import java.util.Scanner;

public class calAreaPerim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el alto; ");
        int Alto = sc.nextInt();
        System.out.println("Ingrese el ancho: ");
        int Ancho = sc.nextInt();

        int Area = Alto * Ancho;
        int Perimetro = (Alto+Ancho)*2;

        System.out.println("El area es: "+Area);
        System.out.println("El perimetro es: "+Perimetro);

        SoluUs();
    }
    public static void SoluUs(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcina numero1: ");
        int num1 = scan.nextInt();
        System.out.println("Proporciona numero2: ");
        int num2 = scan.nextInt();

        System.out.println(num1<num2 ? "El numero2 es mayor" : "El numero1 es Mayor");
        /*if (num1<num2){
            System.out.println("El numero maror es numero2: "+num2);
        }else {
            System.out.println("El numero mayor es numero1; "+num1);
        }*/
    }
}
