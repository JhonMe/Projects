package Herencia;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        //llamamos a super
        //super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    public Empleado(String nombre, double sueldo){
        //llamamos al constructor vacio
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo(){
        return  this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public  String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado [idEmpleado= ").append(this.idEmpleado);
        sb.append(", nombre: ").append(this.nombre);
        sb.append(", Sueldo: ").append(this.sueldo);
        //Este es la otra manera de poder acceder a la info de clase padre
        //sb.append(", Persona").append(super.toString()).append("]");
        sb.append("]");
        return sb.toString();
    }
}
