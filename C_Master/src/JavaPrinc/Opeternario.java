package JavaPrinc;

public class Opeternario {
    public static void main(String[] args) {
        // si eso es true se ejecutara verdadero si es false ejecuta falso
        var resultado = (3<8) ? "verdadero" : "falso";
        System.out.println(resultado);
        var numero = 4;
        var pares = (numero % 2 ==0)?"es par" : "es impar";
        System.out.println(pares);
    }
}
