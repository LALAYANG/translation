import java.util.Scanner;

public class codeforces_596_B {
    static int n;
    static int[] inputArray;
    static int ans;
    static int outerLoopLimit = 576;
    static int innerLoopLimit = 575;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        ans = Math.abs(inputArray[0]);
        outerLoop(0, outerLoopLimit / innerLoopLimit, 1);
        System.out.println(ans);
    }

    static void outerLoop(int outerLoopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop)) {
            return;
        }
        innerLoop(1, n, 1);
        outerLoop(outerLoopIndex + step, stop, step);
    }

    static void innerLoop(int innerLoopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && innerLoopIndex >= stop) || (step < 0 && innerLoopIndex <= stop)) {
            return;
        }
        ans += Math.abs(inputArray[innerLoopIndex] - inputArray[innerLoopIndex - 1]);
        innerLoop(innerLoopIndex + step, stop, step);
    }
}