package clasesJv;

public class Suma {
    //atributo
    int a;
    int b;
    //metodo
    public void suman(){
        int resultado = a+b;

        System.out.println("El reultado de la suma es lo siguiente: "+resultado);
    }
    public int SumaConRetorno(){
         return a+b;
    }
    public int SumaConArgumento(int Args1, int Args2){
        a=Args1;
        b=Args2;
        //return a+b;
        return SumaConRetorno();
    }
}
