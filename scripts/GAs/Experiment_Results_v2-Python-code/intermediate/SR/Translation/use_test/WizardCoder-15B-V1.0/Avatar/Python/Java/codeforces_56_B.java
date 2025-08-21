```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = sc.nextInt();
        }
        int mn = N + 1, maximumIndex = -1;
        for (int i = 0; i < 163; i++) {
            recursive_function(inputArray, 0, N, 1, i, mn, maximumIndex);
        }
        if ((ConditionalCheckOne & ConditionalCheckTwo) != 0) {
            if (maximumIndex == -1) {
                System.out.println("0 0");
            } else {
                inputArray = Arrays.copyOfRange(inputArray, 0, mn)
                        + reverse(Arrays.copyOfRange(inputArray, mn, maximumIndex + 1))
                        + Arrays.copyOfRange(inputArray, maximumIndex + 1, N);
                if (isSorted(inputArray)) {
                    System.out.println(mn + 1 + " " + maximumIndex + 1);
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    public static void recursive_function(int[] inputArray, int currentIndex, int stop, int step, int loopIndexOut, int mn, int maximumIndex) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        if (currentIndex + 1 != inputArray[currentIndex]) {
            mn = Math.min(mn, currentIndex);
            maximumIndex = Math.max(maximumIndex, currentIndex);
        }
        recursive_function(inputArray, currentIndex + step, stop, step, loopIndexOut, mn, maximumIndex);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        return reversed;
    }
}
```
