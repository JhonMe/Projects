import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner bun = new Scanner(System.in);
        float num1;
        float num2;
        System.out.println("Ingrese primer numero: ");
        num1 = bun.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        num2 = bun.nextFloat();
        System.out.println("Ingrese la operacion que quiere realizar");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Divicion");
        int opcion = bun.nextInt();

        switch (opcion){
            case 1:
                float suma = num2 + num1;
                System.out.println("La suma es el siguiente:"+suma);
                break;
            case 2:
                float resta = num1 - num2;
                System.out.println("La resta es:"+resta);
                break;
            case 3:
                float multi = num1 * num2;
                System.out.println("La multiplicacion es el siguiente: "+multi);
                break;
            case 4:
                float divi = num1 / num2;
                System.out.println("La divicion es: "+divi);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }


    }
}
