package csti.com.domian;

public class Congresista extends Politicos {
    private  int idCongreso;
    private  int nroOrden;
    private  String Apellido;
    public  static int nroContador;

    public Congresista(String Nombre, char Genero, int Edad, int nroOrden, String Apellido){
        super(Nombre, Genero, Edad);
        this.idCongreso = ++Congresista.nroContador;
        this.nroOrden =nroOrden;
        this.Apellido=Apellido;
    }
    public int getIdCongreso(){
        return  this.idCongreso;
    }
    public int getNroOrden(){
        return this.nroOrden;
    }
    public void setNroOrden(int nroOrden){
        this.nroOrden = nroOrden;
    }
    public String getApellido(){
        return this.Apellido;
    }
    public void  setApellido(String Apellido){
        this.Apellido = Apellido;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" Usuario: ").append(this.Nombre);
        sb.append(" Mi id es: ").append(this.idCongreso);
        sb.append(" Mi numero de orden es: ").append(this.nroOrden);
        sb.append(" Mi apellido: ").append(this.Apellido);
        return sb.toString();
    }
}
