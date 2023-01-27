import java.util.Scanner;
import java.lang.Math;

public class Arrays {

    public static void main(String[] args) {

        double y;
        int[] Lottozahlen = new int[10];

        for (int i = 0; i < Lottozahlen.length; i++) {
            Lottozahlen[i] = berechneZufallszahl(10);
        }
        berechneZufallszahl(10);

        for (int i = 0; i < Lottozahlen.length; i++) {
            System.out.println(i+": " + Lottozahlen[i]);
        }

        Scanner scan = new Scanner(System.in);
        int zahluser = scan.nextInt();
        boolean hasTreffer = false;
        for (int i = 0; 10 > i; i++) {
            if (zahluser == Lottozahlen[i]) {
                System.out.println("Treffer: " + zahluser);
                hasTreffer = true;

            }
        }
        ausgabe(hasTreffer);
        }


    private static int berechneZufallszahl(int obergrenze) {
        return (int) (Math.random()*obergrenze);
    }

    private static void ausgabe(boolean hasTreffer) {
        System.out.println("Die Zahl ist in den Lottozahlen enthalten:" + hasTreffer);

    }


}