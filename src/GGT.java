class GGT {


    public static int ggt(int a, int b) {


        int h = (a > b) ? b : a;

        for (int i = h; i > 1; i--) {
            if ((a % i) == 0 && (b % i) == 0) {
                return i;
            }
        }

        return 1;
    }


    public static void main(String[] args) {
        System.out.println("GGT von 5 und 25 => "
                     + GGT.ggt(  5, 25
        ) +".");
    }
}