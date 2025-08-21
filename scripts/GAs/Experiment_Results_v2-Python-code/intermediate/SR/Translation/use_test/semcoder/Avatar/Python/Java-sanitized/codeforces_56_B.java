import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = sc.nextInt();
        }
        int mn = N + 1;
        int maximumIndex = -1;
        int OuterLoopEnd = 163;
        int OuterLoopLimit = 162;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            recursiveFunction(0, N, 1, mn, maximumIndex, inputArray);
        }
        if ((ConditionalCheckOne & ConditionalCheckTwo) != 0) {
            if (maximumIndex == -1) {
                System.out.println("0 0");
            } else {
                int[] temp = new int[inputArray.length];
                System.arraycopy(inputArray, 0, temp, 0, mn);
                System.arraycopy(inputArray, mn, temp, mn, maximumIndex + 1 - mn);
                System.arraycopy(inputArray, maximumIndex + 1, temp, maximumIndex + 1, inputArray.length - maximumIndex - 1);
                for (int i = 0; i < temp.length; i++) {
                    inputArray[i] = temp[i];
                }
                if (isSorted(inputArray)) {
                    System.out.println((mn + 1) + " " + (maximumIndex + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    private static void recursiveFunction(int currentIndex, int stop, int step, int mn, int maximumIndex, int[] inputArray) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        if (currentIndex + 1 != inputArray[currentIndex]) {
            mn = Math.min(mn, currentIndex);
            maximumIndex = Math.max(maximumIndex, currentIndex);
        }
        recursiveFunction(currentIndex + step, stop, step, mn, maximumIndex, inputArray);
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static final int ConditionalCheckOne = 106;
    private static final int ConditionalCheckTwo = 423;
}