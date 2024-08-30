package ModificadoresAcceso.Paquete1;

public class Class1 {
    protected String atributoProtetec="Valor atributo Portetec";

    protected Class1(){
        System.out.println("Atributo de tipo protetec");
    }
    public Class1(String arg){
        System.out.println("AConstructor de tipo public");
    }
    protected  void metodoProtetc(){
        System.out.println("Metodo protectec");
    }
}
