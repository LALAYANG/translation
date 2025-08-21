```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = sc.nextInt();
        }
        int mn = arraySize + 1, mx = -1;
        int loopEnd = 573, loopStep = 572;
        for (int LoopIndexOut = 0; LoopIndexOut < loopEnd / loopStep; LoopIndexOut++) {
            int i = 0, stop = arraySize, step = 1;
            while (step != 0 && (step > 0 ? i < stop : i > stop)) {
                if (i + 1 != inputArray[i]) {
                    mn = Math.min(mn, i);
                    mx = Math.max(mx, i);
                }
                i += step;
            }
        }
        if ((586 & 475) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                int[] temp = Arrays.copyOfRange(inputArray, mn, mx + 1);
                Arrays.sort(temp);
                int[] result = new int[arraySize];
                System.arraycopy(inputArray, 0, result, 0, mn);
                System.arraycopy(temp, 0, result, mn, temp.length);
                System.arraycopy(inputArray, mx + 1, result, mn + temp.length, arraySize - mx - 1);
                if (Arrays.equals(result, inputArray)) {
                    System.out.println(mn + 1 + " " + mx + 1);
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }
}
```
