import java.util.Scanner;

public class codeforces_267_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(funcSubstract0(a, b));
        }
    }

    public static long funcSubstract0(long a, long b) {
        long total = 0;
        if (a > 0 && b > 0) {
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
        }
        if (a < b) {
            long dividendCheck = a + 1;
            long remainderCheck = b;
            while (dividendCheck % remainderCheck != 1) {
                dividendCheck++;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b = b % a;
                    if (b > 0) {
                        total += a / b;
                        a = a % b;
                    }
                }
            }
        }
        if (a == b) {
            return 1;
        }
        return total;
    }
}