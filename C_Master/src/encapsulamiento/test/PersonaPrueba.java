package encapsulamiento.test;


import encapsulamiento.dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona  perso1 = new Persona("Jhon", 10000, true);
        //System.out.println(perso1.getNombre());
        perso1.setNombre("Imer Jhon");
        //System.out.println(perso1.getNombre());
        //System.out.println(perso1.getSueldo());
        //System.out.println(perso1.isEliminado());
        System.out.println("El toString"+perso1.toString());
    }
}
