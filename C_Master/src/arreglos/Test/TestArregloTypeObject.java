package arreglos.Test;

import arreglos.Domian.Persona;

public class TestArregloTypeObject {
    public static void main(String[] args) {
        Persona personas[]=new Persona[3];

        personas[0]= new Persona("Jhon");
        personas[1]= new Persona("Karla");
        personas[2]= new Persona("Goliat");

        System.out.println(personas[0]);

        for (int i=0; i< personas.length; i++){
            System.out.println(i+"; "+personas[i]);
        }

        String Frutas[]={"Banana", "Papaya", "Lucma"};
        for (int i =0; i<Frutas.length; i++){
            System.out.println("La fruta es: "+Frutas[i]);
        }
    }
}
