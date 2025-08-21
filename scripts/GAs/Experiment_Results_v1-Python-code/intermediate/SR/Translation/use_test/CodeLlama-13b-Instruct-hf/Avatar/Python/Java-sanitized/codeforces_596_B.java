import java.util.Scanner;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        int absoluteDifferenceSum = 0;
        int outerLoopLimit = 158;
        int maximumLoopCount = 157;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                absoluteDifferenceSum += Math.abs(inputNumbers[i] - inputNumbers[j]);
            }
        }

        System.out.println(absoluteDifferenceSum);
    }
}