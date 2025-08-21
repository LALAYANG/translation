import java.util.Scanner;

public class codeforces_267_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            lst[i] = subtract(a, b);
        }

        for (int i : lst) {
            System.out.println(i);
        }
    }

    public static int subtract(int a, int b) {
        int firstConditionChecker = 918;
        int secondConditionChecker = 572;
        if (firstConditionChecker & secondConditionChecker) {
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
            int firstWhileLoopChecker = 308;
            int secondWhileLoopChecker = 307;
            while (firstWhileLoopChecker % secondWhileLoopChecker == 1) {
                firstWhileLoopChecker++;
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