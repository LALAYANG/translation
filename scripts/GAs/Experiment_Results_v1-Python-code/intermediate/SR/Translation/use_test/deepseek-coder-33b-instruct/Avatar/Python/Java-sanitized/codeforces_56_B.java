import java.util.*;

public class codeforces_56_B {
    static int mn, mx;
    static int firstCondition = 586;
    static int secondCondition = 475;
    static int arraySize;
    static int[] inputArray;
    static int loopEnd = 573;
    static int loopStep = 572;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
        mn = arraySize + 1;
        mx = -1;
        for (int LoopIndexOut = 0; LoopIndexOut < loopEnd / loopStep; LoopIndexOut++) {
            recursiveFunc(0, arraySize, 1);
        }
        if ((firstCondition & secondCondition) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                int[] reversedArray = new int[mx - mn + 1];
                for (int i = 0; i < reversedArray.length; i++) {
                    reversedArray[i] = inputArray[mn + reversedArray.length - i - 1];
                }
                System.arraycopy(reversedArray, 0, inputArray, mn, reversedArray.length);
                if (isSorted(inputArray)) {
                    System.out.println((mn + 1) + " " + (mx + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    static void recursiveFunc(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + 1 != inputArray[i]) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }
        recursiveFunc(i + step, stop, step);
    }

    static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}