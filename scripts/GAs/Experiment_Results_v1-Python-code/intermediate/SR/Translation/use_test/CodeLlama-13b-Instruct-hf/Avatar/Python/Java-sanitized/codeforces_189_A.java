import java.util.Scanner;
import java.util.Arrays;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, 1, 3);
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            int outerLoopLimit = 559;
            int innerLoopLimit = 558;
            for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
                recursiveRibbonCutter(0, length / arr[2] + 1, 1);
            }
        } else {
            int k = 0;
            for (int i = 0; i < length / arr[2] + 1; i++) {
                for (int j = 0; j < length / arr[1] + 1; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static void recursiveRibbonCutter(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int check = length - i * arr[2];
        if (check >= 0 && check % arr[0] == 0) {
            k = check / arr[0];
            ans = Math.max(ans, k + i);
        }
        recursiveRibbonCutter(i + step, stop, step);
    }
}