package ModificadoresAcceso.Paquet2;

import ModificadoresAcceso.Paquete1.Class1;

public class ClassHija extends Class1 {
    public ClassHija(){
        super();
        this.atributoProtetec="Modificando el atributo protecte en la clase hija";
        System.out.println("Atributo protect:"+this.atributoProtetec);
        this.metodoProtetc();
    }
}
