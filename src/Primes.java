public class Primes {
    public static void main(String[] args) {
        int nValues = 50;
        for (int i = 2; i <= nValues; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        int limit = (int) Math.sqrt(n);
        boolean hasDivisor = false;

        for (int j = 2; j <= limit; j++) {
            if (n % j != 0) {
                continue;
            }
            hasDivisor = true;
            break;
        }
        return !hasDivisor;
    }
}