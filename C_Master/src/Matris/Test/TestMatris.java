package Matris.Test;

public class TestMatris {
    public static void main(String[] args) {
        int Edades[][]=new int[3][2];
        System.out.println("Las edades son: "+ Edades);

        Edades[0][0]=4;
        Edades[0][1]=7;
        Edades[1][0]=8;
        Edades[1][1]=6;

        System.out.println("La edad de 00 es: "+Edades[0][0]);
        System.out.println("La edad de 01 es: "+Edades[0][1]);
        System.out.println("La edad de 10 es: "+Edades[1][0]);
        System.out.println("La edad de 11 es: "+Edades[1][1]);

        for (int ren =0; ren< Edades.length; ren++){
            for (int col =0; col<Edades[ren].length; col++){
                System.out.println("La edades: "+ ren+" : "+ col+" : "+Edades[ren][col]);
            }
        }

    }
}
