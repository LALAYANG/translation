import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        int firstCondition = 586;
        int secondCondition = 475;
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int mn = arraySize + 1;
        int mx = -1;
        int loopEnd = 573;
        int loopStep = 572;
        for (int LoopIndexOut = 0; LoopIndexOut < loopEnd / loopStep; LoopIndexOut++) {
            for (int i = 0; i < arraySize; i++) {
                if (i + 1 != inputArray[i]) {
                    mn = Math.min(mn, i);
                    mx = Math.max(mx, i);
                }
            }
        }
        if ((firstCondition & secondCondition) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                int[] resultArray = new int[arraySize];
                for (int i = 0; i < mn; i++) {
                    resultArray[i] = inputArray[i];
                }
                for (int i = mn; i <= mx; i++) {
                    resultArray[i] = inputArray[mx - (i - mn)];
                }
                for (int i = mx + 1; i < arraySize; i++) {
                    resultArray[i] = inputArray[i];
                }
                if (isSorted(resultArray)) {
                    System.out.println((mn + 1) + " " + (mx + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}