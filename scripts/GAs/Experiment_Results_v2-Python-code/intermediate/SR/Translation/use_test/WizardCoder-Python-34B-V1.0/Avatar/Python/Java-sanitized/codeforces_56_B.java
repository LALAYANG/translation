import java.util.Scanner;
import java.util.Arrays;

public class codeforces_56_B {
    public static void main(String[] args) {
        int ConditionalCheckOne = 106;
        int ConditionalCheckTwo = 423;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int mn = N + 1;
        int maximumIndex = -1;
        int OuterLoopEnd = 163;
        int OuterLoopLimit = 162;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            int currentIndex = 0;
            int step = 1;
            while (true) {
                if (step == 0 || (step > 0 && currentIndex >= N) || (step < 0 && currentIndex < 0)) {
                    break;
                }
                if (currentIndex + 1 != inputArray[currentIndex]) {
                    mn = Math.min(mn, currentIndex);
                    maximumIndex = Math.max(maximumIndex, currentIndex);
                }
                currentIndex += step;
            }
        }
        if ((ConditionalCheckOne & ConditionalCheckTwo) != 0) {
            if (maximumIndex == -1) {
                System.out.println("0 0");
            } else {
                int[] temp = new int[N - mn];
                for (int i = 0; i < N - mn; i++) {
                    temp[i] = inputArray[mn + i];
                }
                for (int i = 0; i < maximumIndex - mn + 1; i++) {
                    inputArray[mn + i] = inputArray[maximumIndex - i];
                }
                for (int i = N - 1; i >= maximumIndex + 1; i--) {
                    inputArray[i] = temp[i - maximumIndex - 1];
                }
                if (Arrays.equals(inputArray, Arrays.stream(inputArray).sorted().toArray())) {
                    System.out.println((mn + 1) + " " + (maximumIndex + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }
}