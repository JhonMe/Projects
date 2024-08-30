package csti.com.testComp;
//Usamos el * para no importar uno por uno todas las clases
import csti.com.domian.*;



public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorhp = new Monitor("HPc", 23.4);
        Teclado teclado = new Teclado("Entrada DDC", "Toshiba");
        Raton ratonhp = new Raton("entrada C", "HP");
        computadora computadorahp = new computadora("computadora HP", monitorhp, teclado, ratonhp);

        Monitor monitorGamer = new Monitor("MACc", 23.4);
        Teclado tecladoG = new Teclado("Entrada HDMI", "APLE");
        Raton ratonGamer = new Raton("entrada V8", "HP");
        computadora computadoraGm = new computadora("computadora MAC", monitorGamer, tecladoG, ratonGamer);

        orden orden1 = new orden();
        orden1.agregarComputadora(computadorahp);
        orden1.agregarComputadora(computadoraGm);
        orden1.mostrarOrden();
    }
}
