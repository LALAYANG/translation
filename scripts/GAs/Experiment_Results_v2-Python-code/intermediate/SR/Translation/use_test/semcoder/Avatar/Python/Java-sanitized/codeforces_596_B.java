import java.util.Scanner;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int ans = Math.abs(inputArray[0]);
        int outerLoopLimit = 576;
        int innerLoopLimit = 575;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopLimit; outerLoopIndex++) {
            for (int innerLoopIndex = 1; innerLoopIndex < n; innerLoopIndex++) {
                ans += Math.abs(inputArray[innerLoopIndex] - inputArray[innerLoopIndex - 1]);
            }
        }

        // Uncomment the line below if you want to test the t-test function
        // ttest_ind([14, 41, 2], [27, 85, 69])

        System.out.println(ans);
    }
}