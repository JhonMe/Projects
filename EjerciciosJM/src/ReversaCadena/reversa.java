package ReversaCadena;

class reversa {
    public static void main(String[] args) {
        String cadena = "Programando en Java desde parzibyte.me";
        // Esta será la cadena invertida, prefiero esta vacía
        String invertida = " ";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    }
}
