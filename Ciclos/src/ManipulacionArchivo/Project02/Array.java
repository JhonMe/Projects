package ManipulacionArchivo.Project02;

public class Array {
    /**
     * Este es una matris o un array
     */
    public static void main(String[] args) {
        String nombre[];

        nombre = new String[3];
        nombre[0]="Jhon";
        nombre[1]="Anyi";
        nombre[2]="Alee";

        System.out.printf("%s soy una maquina\n", nombre[1]);
        nombre[1]="Angelina";
        System.out.printf("%s soy una maquina\n", nombre[1]);

        arraymn2();
    }

    public static void arraymn2 () {
        int[] numero={1,2,3,4,5,6};
        System.out.println(numero[0]);
        System.out.println(numero.length);
    }

}
