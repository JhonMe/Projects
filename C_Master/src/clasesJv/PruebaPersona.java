package clasesJv;

public class PruebaPersona {
    /**
     * crearemos un objecto para moficar los datos de nombre y appellido que esta definido en clase persona
     * @param args
     */
    public static void main(String[] args) {
        //definimox una variable de Tipo persona
        Persona persona1;
        //Creamos objetos de nombre y apellido
        persona1 = new Persona();
        persona1.Nombre="Jhon";
        persona1.Apellido = "Mendoza";
        persona1.DevuelveInfo();
    }
}
