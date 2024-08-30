package Herencia.Test;

import Herencia.Empleado;
import Herencia.Cliente;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jhon", 1300);
        System.out.println(empleado1);

        Cliente cliente1 = new Cliente("imer", 'M', 20, "Av Los manitales", new Date(), true);
        System.out.println(cliente1);
    }
}
