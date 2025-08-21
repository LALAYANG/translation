import java.util.Scanner;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int ans = 0;
        int outerLoopLimit = 576;
        int innerLoopLimit = 575;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit; outerLoopIndex += innerLoopLimit) {
            for (int innerLoopIndex = 1; innerLoopIndex < innerLoopLimit; innerLoopIndex++) {
                ans += Math.abs(inputArray[innerLoopIndex] - inputArray[innerLoopIndex - 1]);
            }
        }

        System.out.println(ans);
    }
}