package BloqueInicialisacion;

public class Persona {
    private final int idPersona;
    private static int contadorPrsona;

    static {
        System.out.println("Ejecutando el metodo static");
        ++Persona.contadorPrsona;
    }
    {
        System.out.println("Ejecutando el metodo nostatic");
        //Solo se puede utilizar this en donde no sea static
        this.idPersona=Persona.contadorPrsona++;
    }
    public Persona(){
        System.out.println("Ejecucion de metodos");
    }

    public int getIdPersona() {
        return this.idPersona;
    }
    public String toString(){
        return "El Id es: "+idPersona;
    }
}
