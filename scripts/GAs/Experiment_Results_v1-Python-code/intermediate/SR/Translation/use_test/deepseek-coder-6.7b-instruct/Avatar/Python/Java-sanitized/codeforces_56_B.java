import java.util.Arrays;
import java.util.Scanner;

public class codeforces_56_B {
    static int mn, mx;
    static int firstCondition = 586;
    static int secondCondition = 475;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
        mn = arraySize + 1;
        mx = -1;
        int loopEnd = 573;
        int loopStep = 572;
        for (int loopIndexOut = 0; loopIndexOut < loopEnd / loopStep; loopIndexOut++) {
            recursiveFunc(0, arraySize, 1, inputArray);
        }
        if ((firstCondition & secondCondition) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                int[] tempArray = Arrays.copyOfRange(inputArray, 0, mn);
                int[] reversedPart = Arrays.copyOfRange(inputArray, mn, mx + 1);
                int[] postReversedPart = Arrays.copyOfRange(inputArray, mx + 1, inputArray.length);
                for (int i = 0; i < reversedPart.length; i++) {
                    inputArray[mn + i] = reversedPart[reversedPart.length - i - 1];
                }
                if (isSorted(inputArray)) {
                    System.out.println((mn + 1) + " " + (mx + 1));
                } else {
                    inputArray = tempArray;
                    inputArray = Arrays.concatenate(tempArray, inputArray, postReversedPart);
                    System.out.println("0 0");
                }
            }
        }
    }

    public static void recursiveFunc(int i, int stop, int step, int[] inputArray) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + 1 != inputArray[i]) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }
        recursiveFunc(i + step, stop, step, inputArray);
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}