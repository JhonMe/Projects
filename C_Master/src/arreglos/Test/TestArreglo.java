package arreglos.Test;

public class TestArreglo {
    public static void main(String[] args) {
        int Numero[] = new int[3];
        System.out.println(Numero.length);
        //Accedemos a cada uno de los elemnetos dw los elementos para modificarlos

        Numero[0]=12;
        Numero[1]=2;
        Numero[2]=3;
        System.out.println(Numero[0]);
        for (int i =0; i<Numero.length; i++){
            System.out.println("El elemento edades es: "+i +":"+Numero[i]);
        }
    }
}
