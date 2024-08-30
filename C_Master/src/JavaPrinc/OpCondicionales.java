package JavaPrinc;

public class OpCondicionales {
    public static void main(String[] args) {
        var a = 10;
        var minNumber = 0;
        var maxNumber = 10;

        var ope = a >= 0 && a <= 10;
        //if (ope == true)
        if (ope){
            System.out.println("Se encuentra dentro del rango");
        } else {
            System.out.println("Esta fuera del rango");
        }

        var diaDescanso = false;
        var vacaciones = true;

        if (diaDescanso || vacaciones){
            System.out.println("El padre asistira al partido de su hijo");
        }
        else{
            System.out.println("El padres no podra asistir al juego de su hijo ");
        }
    }
}
