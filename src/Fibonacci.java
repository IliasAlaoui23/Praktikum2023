public class Fibonacci {
    public static void main(String[] args) {
        berechneFibonacci(100);
    }

    private static void berechneFibonacci(int n) {
        int f2 = 1;
        int f1 = 1;
        System.out.println("fibonacci von 1: " + f1);
        System.out.println("fibonacci von 2: " + f2);
        int fibonacci;
        for (int i=3; i<n;i++) {
            fibonacci = f1+f2;
            System.out.println("fibonacci von  " + i+ ": "+ fibonacci);
            f1 = f2;
            f2 = fibonacci;
        }
    }
}