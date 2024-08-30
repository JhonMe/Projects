package SumaAcumulativa;

public class SumAcu {
    public static void main(String[] args) {
        System.out.println("**SUMA ACUMULATIVA**");

        final int max=5;
        int AcumuladorSuma =0;
        //Iterar los valores
        int numero =1;
        while (numero<=max){
            //Realiza la suma acumulativa
            AcumuladorSuma+=numero; //Acumulador suma=Acumuladorsuma+numero
            numero++;
            System.out.println("EL NUMERO:"+max+" Acumulador suma:"+AcumuladorSuma);
        }

        final int Maximo=5;
        int sumaAcomulativa=0;
        int num=1;

        System.out.println("**LA SUMA CON DO WHILE**");
        do {
            System.out.println("EL MAXIMO DE NUMERO ES:"+Maximo+" Total es:"+sumaAcomulativa);
            sumaAcomulativa+=num;
            num++;
        }while (num <= Maximo);

        System.out.println("**LA SUMA CON FOR**");
        final int maxi=6;
        int Acomu=0;
        for (int i=0; i<maxi; i++){
            Acomu+=i;
            System.out.println("El maximo es:"+maxi+" "+Acomu+":");
        }
    }
}
