import java.util.Scanner;

public class ArrayBsp {

    public static void main(String[] args) {

        int [] LottoZahlen = new int[6];

        for(int i=0; i<LottoZahlen.length; i++) {
            Scanner scan = new Scanner(System.in);
            int zahlUser = scan.nextInt();
            LottoZahlen[i] = zahlUser;
        }

        for(int i= 0; i< LottoZahlen.length; i++){
            System.out.println(LottoZahlen[i]);
        }

    }
}