import java.util.Scanner;
import java.util.Arrays;

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
        int[] mnMx = new int[]{arraySize + 1, -1};
        int loopEnd = 573;
        int loopStep = 572;
        for (int loopIndexOut = 0; loopIndexOut < loopEnd / loopStep; loopIndexOut++) {
            recursiveFunc(0, arraySize, 1, mnMx, inputArray);
        }
        if ((firstCondition & secondCondition) != 0) {
            if (mnMx[1] == -1) {
                System.out.println("0 0");
            } else {
                int[] temp = Arrays.copyOfRange(inputArray, mnMx[0], mnMx[1] + 1);
                for (int i = 0; i < temp.length / 2; i++) {
                    int tempIndex = temp.length - i - 1;
                    int tempValue = temp[i];
                    temp[i] = temp[tempIndex];
                    temp[tempIndex] = tempValue;
                }
                inputArray = Arrays.copyOf(inputArray, mnMx[0] + temp.length);
                System.arraycopy(temp, 0, inputArray, mnMx[0], temp.length);
                System.arraycopy(inputArray, mnMx[1] + 1, inputArray, mnMx[0] + temp.length, arraySize - mnMx[1] - 1);
                if (Arrays.equals(inputArray, Arrays.stream(inputArray).sorted().toArray())) {
                    System.out.println((mnMx[0] + 1) + " " + (mnMx[1] + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    public static void recursiveFunc(int i, int stop, int step, int[] mnMx, int[] inputArray) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + 1 != inputArray[i]) {
            mnMx[0] = Math.min(mnMx[0], i);
            mnMx[1] = Math.max(mnMx[1], i);
        }
        recursiveFunc(i + step, stop, step, mnMx, inputArray);
    }
}