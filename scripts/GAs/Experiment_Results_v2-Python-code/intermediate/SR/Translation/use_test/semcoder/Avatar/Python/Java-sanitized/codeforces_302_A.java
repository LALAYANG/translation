import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numIterations = scanner.nextInt();
        int sa = scanner.nextInt();
        sa = Math.min(n - sa, sa);

        for (int i = 0; i < numIterations; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            if (b % 2 == 1 && b <= sa * 2) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}