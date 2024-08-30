package ManipulacionArchivo.Project02;

public class forech {
    /**
     * Utilizamos el ciclo for como tambien el ciclo while y por ultimo que es una mejor practica el forech
     * @param args
     */
    public static void main(String[] args) {
        String[] nombres = {"Jhon", "Imer", "Juan", "Miguel", "Jose"};

        int c =0;
        while(c<nombres.length){
            System.out.println(nombres[c]);
            c++;
        }
        for (int i=0;i<nombres.length; i++){
            System.out.println(nombres[i]);
        }
        for (String dato : nombres){
            System.out.println(dato);
        }
    }
}
