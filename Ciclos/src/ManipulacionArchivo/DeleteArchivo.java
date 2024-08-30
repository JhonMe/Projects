package ManipulacionArchivo;

import java.io.File;

public class DeleteArchivo {
    public static void main(String[] args) {
        File file = new File("Folder\\miPrimerDocumento.txt");
        if (file.delete()){
            System.out.println("El archivo se borrado correctamente");
        }else {
            System.out.println("No se pudo borrar el archivo");
        }
    }
}
