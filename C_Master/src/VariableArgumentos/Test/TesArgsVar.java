package VariableArgumentos.Test;

public class TesArgsVar {
    public static void main(String[] args) {
        //recinimos elementos indifenidos
        imprimirNumero(3,3,4);
        imprimirNumero(5,5);

        variosParametros("Jhon",2,2,2);
    }
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre:"+nombre);
        imprimirNumero(numeros);
    }

    /**
     * con esta sintaxis indicamos que vamos a recibir una cantidad de elementos indifinidos
     * @param numeros
     */
    private static void imprimirNumero(int... numeros){
        for (int i =0; i<numeros.length; i++){
            System.out.println("Numero:"+numeros[i]);
        }
    }
}
