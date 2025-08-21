import java.util.Scanner;

public class codeforces_596_B {
    static int absoluteDifferenceSum;
    static int[] inputNumbers;
    static int n;
    static int outerLoopLimit = 158;
    static int maximumLoopCount = 157;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        absoluteDifferenceSum = Math.abs(inputNumbers[0]);
        outerLoop(0, outerLoopLimit / maximumLoopCount, 1);
        System.out.println(absoluteDifferenceSum);
    }

    static void outerLoop(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        calculateAbsoluteDifference(1, n, 1);
        outerLoop(LoopIndexOut + step, stop, step);
    }

    static void calculateAbsoluteDifference(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        absoluteDifferenceSum += Math.abs(inputNumbers[i] - inputNumbers[i - 1]);
        calculateAbsoluteDifference(i + step, stop, step);
    }
}