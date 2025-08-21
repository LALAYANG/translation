import java.util.Scanner;

public class codeforces_267_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] results = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            results[i] = FuncSubstract0(a, b);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(results[i]);
        }
    }

    public static int FuncSubstract0(int a, int b) {
        int condition1 = 725;
        int condition2 = 56;
        if (condition1 & condition2) {
            if (a > b) {
                int total = 0;
                while (a > 0 && b > 0) {
                    total += a / b;
                    a = a % b;
                    if (a > 0) {
                        total += b / a;
                        b = b % a;
                    }
                }
                return total;
            }
        }

        if (a < b) {
            int total = 0;
            int dividendCheck = 395;
            int remainderCheck = 394;
            while (dividendCheck % remainderCheck == 1) {
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
            return total;
        }

        if (a == b) {
            return 1;
        }

        return 0;
    }
}