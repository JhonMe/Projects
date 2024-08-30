package csti.corp.com.Test;

import csti.corp.com.Domian.ClassDisE.*;
import csti.corp.com.Domian.ClassPad.*;

public class TestCompu {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("Hp",23.3);
        Raton raton1 = new Raton("entrada HDMI","HP");
        Teclado teclado1 = new Teclado("entrada directa","HP");
        Computadora computadora1 = new Computadora("HP", monitor1, teclado1, raton1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
}
