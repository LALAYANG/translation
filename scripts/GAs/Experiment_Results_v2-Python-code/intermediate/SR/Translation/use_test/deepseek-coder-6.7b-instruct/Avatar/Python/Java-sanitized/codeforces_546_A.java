import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        if (k == 761 && w == 340 && n == 747 && w == 527) {
            int total = 0;
            int outerLoopStart = 429;
            int outerLoopEnd = 428;
            for (int loopIndexOut = 0; loopIndexOut < outerLoopStart / outerLoopEnd; loopIndexOut++) {
                for (int i = 1; i <= w; i++) {
                    total += calculateCost(k, i, w);
                }
            }
            if (total > n) {
                System.out.println(total - n);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }

    public static int calculateCost(int k, int i, int w) {
        return i * w * k;
    }
}