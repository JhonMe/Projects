package ForEch;

public class testForEchObject {
    public static void main(String[] args) {
        NombreObject nombres[]={new NombreObject("Juan"), new NombreObject("Jose"), new NombreObject("Pedro")};
        for (NombreObject nombre: nombres){
            System.out.println(nombre);
        }
    }
}
