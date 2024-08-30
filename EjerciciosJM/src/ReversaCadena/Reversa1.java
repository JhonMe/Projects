package ReversaCadena;

public class Reversa1 {
    public static void main(String[] args) {
        var cadena ="Hola buenas tardes";
        var revez = " ";
        for (int i =cadena.length()-1; i>=0; i--){
            revez += cadena.charAt(i);
        }
        System.out.println("Original:"+cadena);
        System.out.println("Este es al revez:"+revez);
    }
}
