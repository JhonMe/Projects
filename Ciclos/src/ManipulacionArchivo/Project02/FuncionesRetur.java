package ManipulacionArchivo.Project02;

public class FuncionesRetur {
    /**
     * manejo de funcion suma y funcion datos usuando varias veces
     */
    public static void main(String[] args) {
        int sumar= suma(23,23);
        System.out.println(sumar);

        String dato = datos("JHON", 20);
        System.out.println(dato);

        System.out.println(resta(7.3, 4.3));
    }
    static int suma(int a, int b){
        return a + b;
    }
    static String datos(String nombre, int edad){
        return "Hola mi nombre es "+nombre+" y tengo "+ edad + " años";
    }

    /**
     * hacemos sobre carga de datos para entero y decimales en resta
     */
    static int resta(int a, int b){
        return a-b;
    }
    static double resta(double a, double b){
        return a-b;
    }
}
