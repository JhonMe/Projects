package clasesJv;

public class SumaPrueba {
    public static void main(String[] args) {
        Suma suma1 = new Suma();
        suma1.a=12;
        suma1.b =12;
        suma1.suman();

        int resultado = suma1.SumaConRetorno();
        System.out.println("Resiltado desde SumaPrueba: "+resultado);

        int resultados = suma1.SumaConArgumento(3, 4);
        System.out.println("La sumw de los argumentos es: "+resultados);
    }
}
