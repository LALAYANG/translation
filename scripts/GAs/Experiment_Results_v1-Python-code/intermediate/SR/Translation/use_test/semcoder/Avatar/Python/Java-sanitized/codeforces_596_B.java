import java.util.Scanner;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = scanner.nextInt();
        }

        int absoluteDifferenceSum = Math.abs(inputNumbers[0]);
        int outerLoopLimit = 158;
        int maximumLoopCount = 157;

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit; LoopIndexOut += maximumLoopCount) {
            for (int i = 1; i < n; i++) {
                absoluteDifferenceSum += Math.abs(inputNumbers[i] - inputNumbers[i - 1]);
            }
        }

        System.out.println(absoluteDifferenceSum);
    }
}