package AutoboxingUnboxing;

public class autoUnboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos
        /*
        int=Intenger
        long=Long
        float=Float
        daunle=Dauble
         */

        Integer entero=19; //Autoboxing
        System.out.println("Entero:"+entero);
        System.out.println("Entero a Dauble:"+entero.doubleValue());

        int entero2= entero;//Unboxing
        System.out.println("Entero2 es:"+entero2);
    }
}
