package Enumeraciones;

public class Test {
    public static void main(String[] args) {
        System.out.println("El 1 dia es:"+Enumeracion.LUNES);
        System.out.println("El 2 dia es:"+Enumeracion.MARTES);
        System.out.println("El 3 dia es:"+Enumeracion.MIERCOLES);
        System.out.println("El 4 dia es:"+Enumeracion.JUEVES);
        System.out.println("El 5 dia es:"+Enumeracion.VIERNES);
        System.out.println("El 6 dia es:"+Enumeracion.SABADO);
        System.out.println("El 7 dia es:"+Enumeracion.DOMINGO);

        indicarDiaSemana(Enumeracion.MIERCOLES);
    }
    private static void indicarDiaSemana(Enumeracion dias){
        switch (dias){
            case LUNES:
                System.out.println("Hoy es lunes");
                break;
            case MARTES:
                System.out.println("Hoy es martes");
                break;
            case MIERCOLES:
                System.out.println("Hoy es miercoles");
                break;
            case JUEVES:
                System.out.println("Hoy es Jueves");
                break;
            case VIERNES:
                System.out.println("Hoy es Viernes");
                break;
            case SABADO:
                System.out.println("Hoy es Sabado");
                break;
            case DOMINGO:
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("No hay el dia");
        }
    }
}
