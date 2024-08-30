package ManipulacionArchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        File file = new File("Folder\\miPrimerDocumento.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exepcion al abrir el archivo"+e);
        }
    }
}
