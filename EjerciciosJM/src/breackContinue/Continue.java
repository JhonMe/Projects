package breackContinue;

public class Continue {
    public static void main(String[] args) {
        for (int j =1; j<=10; j++){
            if (j%2==0){
                System.out.println("Valor:"+j);
                continue;
            }
        }
    }
}
