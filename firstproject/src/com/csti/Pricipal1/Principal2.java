package com.csti.Pricipal1;

import com.csti.Model.Curso;

public class Principal2 {
    public static void main(String[] args) {
        String soccer1 = new String();
        Curso soccer = new Curso(12, 3, "Jhon","Mendoza","Hecker");

        System.out.println("Nombre: "+soccer.Nombre);
        System.out.println("Apellido: "+soccer.Apellido);
        System.out.println("Grado: "+soccer.grado);
        System.out.println("Numero de camiseta: "+soccer.Numero_camiseta);
        System.out.println("Nombre de Equipo: "+soccer.Nombre_Equipo);
    }

}
