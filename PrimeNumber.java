public class PrimeNumber {
    public static void prime(int n) {
        if (n == 0 || n == 1) {
            System.out.println("Not Prime");
        }
        if (n == 2) {
            System.out.println("Prime");
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
            }
            else {
                 System.out.println("Prime");
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        prime(n);

    }
}
