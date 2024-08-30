package com.csti.encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno Alu = new Alumno(1, "Jhon","Subcrito");

        System.out.println("Id "+Alu.getId());
        System.out.println("Nombre "+Alu.getNombre());
        System.out.println("Apellido "+Alu.getApellido());
    }

}
