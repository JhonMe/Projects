package tablaMultiplicar;

public class bucleWhile {
    public static void main(String[] args) {
        System.out.println("**MULTIPLICACION**");
        var numero =1;
        var mul =4;
        while (numero<=12){
            System.out.println("Multiplo de:"+mul+" x "+numero+" = "+(mul*numero));
            numero++;
        }
    }
}
