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

        for (int outerLoopIndex = 0, stop = outerLoopLimit / innerLoopLimit, step = 1;
             step == 0 || (step > 0 && outerLoopIndex < stop) || (step < 0 && outerLoopIndex > stop);
             outerLoopIndex += step) {
            for (int innerLoopIndex = 1, stop = n, step = 1;
                 step == 0 || (step > 0 && innerLoopIndex < stop) || (step < 0 && innerLoopIndex > stop);
                 innerLoopIndex += step) {
                ans += Math.abs(inputArray[innerLoopIndex] - inputArray[innerLoopIndex - 1]);
            }
        }
        System.out.println(ans);
    }
}