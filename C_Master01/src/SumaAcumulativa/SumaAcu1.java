package SumaAcumulativa;

public class SumaAcu1 {
    public static void main(String[] args) {
        final  int MAXIMO =6;
        int Acumulado =0;
        for (int i=0; i<MAXIMO; i++){
            Acumulado+=i;
            System.out.println("Valor es:"+MAXIMO+" "+Acumulado);
        }
    }
}
