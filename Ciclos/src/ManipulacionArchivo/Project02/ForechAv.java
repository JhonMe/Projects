package ManipulacionArchivo.Project02;

public class ForechAv {
    public static void main(String[] args) {
        int[][]x ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
           for(int[] Matrizinterna: x){
               for (int dato: Matrizinterna)
               {
                   System.out.println(dato);
               }
           }

    }
}
