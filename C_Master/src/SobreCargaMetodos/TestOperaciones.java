package SobreCargaMetodos;

public class TestOperaciones {
    public static void main(String[] args) {
        //no es nesesario esto porque usamos static
        //Operadores operacion1 = new Operadores(3,2);
        var operacion1 = Operadores.sumar(3.2, 2.3);
        System.out.println(operacion1);
    }
}
