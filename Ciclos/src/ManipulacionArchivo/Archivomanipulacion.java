package ManipulacionArchivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Archivomanipulacion {
    public static void main(String[] args) {
        File Folder = new File("Folder");
        File file = new File("Folder\\miPrimerDocumento.txt");
        try {
            boolean fileCreator = Folder.mkdir();
            boolean fileCreate = file.createNewFile();
            FileWriter filewriter = new FileWriter(file);
            filewriter.write("aprediendo a crear archivos siii ");
            filewriter.close();

            if (fileCreator && fileCreate){
                System.out.println("El archivo se creo correctamente");
            }else {
                System.out.println("El archivo ya existe o error al crear");
            }
        } catch (IOException a) {
            System.out.println("Error al crear la exepccion "+a);
        }
    }
}
