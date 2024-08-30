package JavaPrinc;

public class breack {
    public static void main(String[] args) {
        for (var cont = 0; cont <=100; cont++ ){
            if (cont % 2 ==0) {
                System.out.println("El contador indica: "+ cont);
                //break;
            }
        }

        for (var conta = 0; conta <=40; conta++ ){
            if (conta % 2 !=0) {
                continue;
            }
            System.out.println("El contador indica: "+ conta);
        }
    }
}
