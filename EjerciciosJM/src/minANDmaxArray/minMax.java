package minANDmaxArray;

public class minMax {
    public static void main(String[] args) {
        int [] arr={3,5,7,1,5,8,5};

        int max =arr[0];
        int min =arr[0];
        for (int num: arr){
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
        }
        System.out.println("El numero maximo es:"+max);
        System.out.println("Este es numero menor es:"+min);
    }
}
