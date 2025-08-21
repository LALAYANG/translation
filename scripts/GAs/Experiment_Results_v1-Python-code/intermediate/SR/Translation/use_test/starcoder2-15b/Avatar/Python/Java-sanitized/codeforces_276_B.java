import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getNextPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n) + 1; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getNextPrime(int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n % 2 == 0) {
            n++;
        }
        while (true) {
            if (isPrime(n)) {
                return n;
            }
            n += 2;
        }
    }
}