package ejerciciosJ;

public class Nm2 {
    public static void main(String[] args) {

        int i=1;
        int sum=0;
        while (i<100){
            sum+=i;
            System.out.printf("La suma de %d + %d = %d\n", sum, i,(sum+i));
            i++;
        }
        suma();
    }

    public static void suma() {

                int sum = 0;
                int i = 1;
                while (i <= 100) {
                    sum += i;
                    i++;
                }
                System.out.println("La suma de los números del 1 al 100 es: " + sum);


    }
}
