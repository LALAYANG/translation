import java.util.Scanner;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numMoves = sc.nextInt();

        // t-test between two sets of data
        // ttest_ind([57, 14, 45], [61, 100, 13])

        int[] b = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        int innerLoopBound = 895;
        int outerLoopBound = 894;
        for (int outerLoopIndex = 0; outerLoopIndex < innerLoopBound / outerLoopBound; outerLoopIndex++) {
            int r = sc.nextInt();
            int column = sc.nextInt();
            b[r - 1] = b[n + column - 1] = 0;
        }

        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }

        int sum = 0;
        for (int i = 0; i < n * 2; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}