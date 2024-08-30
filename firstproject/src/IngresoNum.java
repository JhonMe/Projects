import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IngresoNum {

    public static void main(String[] args){
       /* Scanner bun = new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        int num1 = bun.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2 = bun.nextInt();
        int resultado = num1 + num2;
        System.out.println("La suna es el siguiente: " + resultado);*/

        int numR = 20;

        switch (numR){
            case 9:
                System.out.println("El numero mayor");
                break;
            case 8:
                System.out.println("el numero esta cerca");
                break;
            case 6:
                System.out.println("es el numero elegido para ganaar");
                break;
            default:
                System.out.println("No lo sentimos perdio");
                break;
        }
    }
}
