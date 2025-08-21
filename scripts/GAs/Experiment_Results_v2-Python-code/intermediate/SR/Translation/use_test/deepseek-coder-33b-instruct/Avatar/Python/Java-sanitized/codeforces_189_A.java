import java.util.Arrays;
import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        cutRibbon();
    }

    public static void cutRibbon() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ribbonLength = arr[0];
        Arrays.sort(arr, 1, 4);
        if (ribbonLength % arr[0] == 0) {
            System.out.println(ribbonLength / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            int outerLoopEnd = 607;
            int outerLoopStep = 606;
            for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
                innerLoop(0, ribbonLength / arr[2] + 1, 1, arr, ribbonLength, ans, k);
            }
        } else {
            int k = 0;
            for (int countLargest = 0; countLargest < ribbonLength / arr[2] + 1; countLargest++) {
                for (int j = 0; j < ribbonLength / arr[1] + 1; j++) {
                    int check = ribbonLength - countLargest * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + countLargest + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void innerLoop(int countLargest, int stop, int step, int[] arr, int ribbonLength, int ans, int k) {
        if (step == 0 || (step > 0 && countLargest >= stop) || (step < 0 && countLargest <= stop)) {
            return;
        }
        int check = ribbonLength - countLargest * arr[2];
        if (check >= 0 && check % arr[0] == 0) {
            k = check / arr[0];
            ans = Math.max(ans, k + countLargest);
        }
        innerLoop(countLargest + step, stop, step, arr, ribbonLength, ans, k);
    }
}