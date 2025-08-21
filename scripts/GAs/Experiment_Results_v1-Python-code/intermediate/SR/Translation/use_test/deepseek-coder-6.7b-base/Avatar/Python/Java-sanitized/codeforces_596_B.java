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
        for (int i = 0; i < outerLoopLimit / maximumLoopCount; i++) {
            for (int j = 1; j < n; j++) {
                absoluteDifferenceSum += Math.abs(inputNumbers[j] - inputNumbers[j - 1]);
            }
        }
        System.out.println(absoluteDifferenceSum);
    }
}