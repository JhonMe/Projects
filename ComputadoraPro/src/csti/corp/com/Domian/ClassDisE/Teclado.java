package csti.corp.com.Domian.ClassDisE;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado=++Teclado.contadorTeclados;
    }

    public String toString(){
        return " Id es: "+idTeclado+super.toString();
    }
}
