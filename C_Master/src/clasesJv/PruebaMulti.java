package clasesJv;

public class PruebaMulti {
    public static void main(String[] args) {

        miMetodo();
        Multiplicacion multiplicando = new Multiplicacion();
        multiplicando.i=10;
        multiplicando.j=20;
        multiplicando.Multi();

        int resultado = multiplicando.Multipliacion();
        System.out.println("El resultado es: "+resultado);

        int Res= multiplicando.MultiArgs(2,3);
        System.out.println("El resultado es lo siguiente: "+Res);

        //varianles locales solo se usan a nivel de este metodo main
        var g = 7;
        var s = 3;

        //constructor vacio
        Multiplicacion multiplicacion1 = new Multiplicacion();
        System.out.println("Valor de i es: "+multiplicacion1.i);
        System.out.println("Valor de j es: "+multiplicacion1.j);

        //constructor con valor entrada de parametro
        Multiplicacion multiplicacion2 = new Multiplicacion(2,1);
        System.out.println("Valor de i es: "+multiplicacion2.i);
        System.out.println("Valor de j es: "+multiplicacion2.j);
    }

    /**
     * siempre usamos static para hacer llamado hacia metodo main
     */
    public static  void miMetodo(){
        System.out.println("Mi metodo vacio");
    }
}
