package Matris.Test;

import Matris.Domian.PersMatriz;

public class TestMatrizObject {
    /**
     * aqui visualizamos las matruces de tipo obejto de 2 maneras en forma cuadrada y directamente
     * @param args
     */
    public static void main(String[] args) {
        //Primera manera
        String color[][]=new  String[3][2];

        color[0][0]="Rojo";
        color[0][1]="Verde";
        color[1][0]="Amarillo";
        color[1][1]="Gris";

        for (int reg =0; reg<color.length; reg++){
            for (int col =0; col<color[reg].length; col++){
                System.out.println("Los colores es: "+reg+" : "+col+ " : "+color[reg][col]);
            }
        }
        //Segunda manera
        String frutas[][]={{"Naranja","Papaya"},{"Manzana","Fresa"}};

        for (int ren=0; ren< frutas.length;ren++){
            for (int co=0; co<frutas[ren].length; co++){
                System.out.println("Las frutas ricas: "+ren+" : "+co+" : "+frutas[ren][co]);
            }
        }

        //aqui estamos usando el atributo nombre de la clase PersMatriz
        PersMatriz personas[][]=new PersMatriz[4][4];
        personas[0][0]=new PersMatriz("Jhon");
        personas[0][1]=new PersMatriz("Pedro");
        personas[0][2]=new PersMatriz("Julisa");
        personas[0][3]=new PersMatriz("Miguel");
        personas[1][0]=new PersMatriz("Pedro");
        personas[1][1]=new PersMatriz("Julisa");
        personas[1][2]=new PersMatriz("Miguel");
        personas[1][3]=new PersMatriz("Miguel");
        //Estamos utilizando el metodo imprimir para imprimir en una sola line de codigo
        imprimir(personas);

        /*for (int reng=0; reng< personas.length;reng++){
            for (int colu=0; colu<personas[reng].length; colu++){
                System.out.println("Las personas: "+reng+" : "+colu+" : "+personas[reng][colu]);
            }
        }*/
    }
    //Nuevo metodo imprimir
    public static void imprimir(Object matriz[][]){
        for (int reng=0; reng< matriz.length;reng++){
            for (int colu=0; colu<matriz[reng].length; colu++){
                System.out.println("Las personas: "+reng+" : "+colu+" : "+matriz[reng][colu]);
            }
        }
    }
}
