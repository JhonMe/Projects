package com.csti;

import com.csti.Model.Persona;

public class Principal {

    public static void main(String[] args) {
        String S1 = new String();
        Persona p1 = new Persona("JHON", 20, "Huariaca", "C. D. Pasco");

        System.out.println(p1.Nombre);
        System.out.println(p1.edad);
        System.out.println(p1.Direccion);
        System.out.println(p1.Departamento);
    }
}
