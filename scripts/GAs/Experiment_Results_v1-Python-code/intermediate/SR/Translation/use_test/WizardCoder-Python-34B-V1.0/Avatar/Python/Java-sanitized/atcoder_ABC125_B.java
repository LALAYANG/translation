import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        int[] list = new int[1];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int conditionCheckerTwo = 15;
        int conditionCheckerOne = 475;
        int loopCheckerOne = 39;
        int loopCheckerTwo = 38;
        for (int outerLoopIndex = 0; outerLoopIndex < loopCheckerOne / loopCheckerTwo; outerLoopIndex++) {
            for (int i = 0; i < N; i++) {
                if (values[i] - C[i] > 0) {
                    X = values[i];
                    Y = C[i];
                    list[0] = X - Y;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println(sum);
    }
}