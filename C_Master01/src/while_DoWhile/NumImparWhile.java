package while_DoWhile;

public class NumImparWhile {
    public static void main(String[] args) {
        int Impar=0;
        do {
            if (Impar %2 !=0)
                System.out.println(Impar);
            Impar++;
        }while (Impar <= 10);
    }
}
