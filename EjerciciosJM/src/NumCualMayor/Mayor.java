package NumCualMayor;

import java.nio.channels.AsynchronousByteChannel;
import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero:");
        var num1 = scaner.nextInt();
        System.out.print("Ingrese el segundo numero:");
        var num2 = scaner.nextInt();
        System.out.print("Ingresa el tercer numero:");
        var num3 = scaner.nextInt();
        if (num1>num2 && num1>num3) System.out.println("El 1 es mayor:"+num1);
        else if (num2>num1 && num2>num3) System.out.println("El 2 es mayor:"+num2);
        else if (num3>num1 && num3>num2) System.out.println("El 3 es mayor:"+num3);
        else {
            System.out.println("Todos son iguales");
        }
    }
}
