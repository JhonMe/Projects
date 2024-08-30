package csti.corp.com.Domian.ClassDisE;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton=++Raton.contadorRatones;
    }
    public String toString(){
        return "Id Raton: "+idRaton+" tipo entrada: "+super.toString();
    }
}
