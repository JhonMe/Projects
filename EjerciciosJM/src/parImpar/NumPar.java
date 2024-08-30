package parImpar;

public class NumPar {
    public static void main(String[] args) {
        var numero = 0;

        while (numero<=10){
            if (numero % 2 ==0){
                System.out.println(numero);
            }
            numero++;
        }
    }
}
