package sumaElementoArray;

public class sumArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int suma =0;
        for (int num : arr){
            suma+=num;
        }
        System.out.println("La suma del array es:"+suma);
    }
}
