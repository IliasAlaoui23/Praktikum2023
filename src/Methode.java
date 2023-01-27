public class Methode {
    public static void main(String[] args) {
        erstelleGegner("Olaf", 80);
        erstelleGegner("Peter", 70);

    int summe = berechneSumme(30, 30);
    System.out.println(summe);
    }

    public static void erstelleGegner(String name, int leben) {
        String gegnerName = name;
        int gegnerLeben = leben;
        System.out.println("Gegner wurde erstellt!!!" + gegnerName + gegnerLeben);
    }
public static int berechneSumme(int zahl1, int zahl2){
        int summe = zahl1 + zahl2;
        return summe;

}
}