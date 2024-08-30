package ModificadoresAcceso.TestMdificador;

import ModificadoresAcceso.Paquet2.ClassHija;
import ModificadoresAcceso.Paquete1.Class1;

public class Test {
    public static void main(String[] args) {
        Class1 clases = new Class1("holaa mano");
        //Ya no podemos acceder al atributo porque estamos en otro paquete y atributo protectec esta definido como protetec
        //System.out.println("publico"+Class1.atributoProtetec);

        ClassHija clasehija=new ClassHija();
        System.out.println("Clase hija"+clasehija);
    }
}
