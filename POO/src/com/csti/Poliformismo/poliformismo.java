package com.csti.Poliformismo;

import com.csti.Herencia.Persona;
import com.csti.Herencia.consultor;
import com.csti.Herencia.empleado;

public class poliformismo {
    public static void main(String[] args) {
        Persona vector[]= new  Persona[3];
        vector[0]= new  Persona();
        vector[1]= new empleado();
        vector[2]= new consultor();
        vector[3]= new Jefe();

        Persona per = new Persona();
        consultor consul=new consultor();

        per = consul;
    }
}
