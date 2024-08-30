package clasesJv;

public class Multiplicacion {
    int i;
    int j;

    public void Multi(){
        int resultado = i+j;
        System.out.println("El resultado es: "+resultado);
    }

    /**
     * suma que podremo utilizar llamando al metodo para poder sumar
     * @return
     */
    public int Multipliacion(){
        return i+j;
    }

    /**
     * Usamos this para poder ver que es un atributo de nuestra clase y np variable local
     * @param Arg1
     * @param Arg2
     * @return
     */
    public int MultiArgs( int Arg1, int Arg2){
        this.i=Arg1;
        this.j = Arg2;
        //return i+j;
        return this.Multipliacion();
    }


    //SOBRE CARGA DE CONSTRUCTORES PORQYE HAY MAS DE UN CONSTRUCTOR
    /**
     * Constructor vacio
     */
    public Multiplicacion(){
        this.i=0;
        this.j=0;
        System.out.println("Ejecutando Constructor Vacio");
    }
    /**
     * constructor con valor
     */
    public Multiplicacion(int i, int j){
        this.i = i;
        this.j = j;
        System.out.println("Ejecutando constructor con valor");
    }
}
