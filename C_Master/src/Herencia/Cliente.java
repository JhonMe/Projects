package Herencia;

import java.util.Date;

public class Cliente extends Persona{

    private int idCliente;
    private Date fechaRefistro;
    private boolean vib;
    private static int contadorCliente;

    public Cliente (String nombre, char genero, int edad, String direccion, Date fechaRefistro, boolean vib){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRefistro = fechaRefistro;
        this.vib=vib;
    }
    public int getIdCliente(){
        return this.idCliente;
    }
    public Date getFechaRefistro(){
        return this.fechaRefistro;
    }
    public void setFechaRefistro(Date fechaRefistro){
        this.fechaRefistro = fechaRefistro;
    }
    public boolean isVib(){
        return this.vib;
    }
    public void setVib(boolean vib){
        this.vib = vib;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("El Cliente id es: ").append(this.idCliente);
        sb.append(" nombre cliente: ").append(this.nombre);
        sb.append("  genero: ").append(this.genero);
        sb.append(" Edad: ").append(this.edad);
        sb.append(" Direccion: ").append(this.direccion);
        sb.append(" Fecha del Registro: ").append(this.fechaRefistro);
        sb.append(" El ciente es vib: ").append(this.vib);
        return sb.toString();
    }
}
