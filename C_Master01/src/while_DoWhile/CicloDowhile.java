package while_DoWhile;

public class CicloDowhile {
    public static void main(String[] args) {
        //incremento
        int contador1 =1;
        do {
            System.out.println(contador1);
            contador1++;
        }while (contador1<=3);

        //decremento
        System.out.println("Decremento");
        int contador0=10;
        do {
            System.out.println(contador0--);
        }while (contador0 > 0);
    }
}
