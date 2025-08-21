```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int m = scanner.nextInt();
        int[] outputArray = new int[arraySize];
        Arrays.fill(outputArray, 0);
        int[] comp = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int currentIndex = l;
            while (currentIndex <= r) {
                int condition1 = 27;
                int condition2 = 655;
                int condition3 = 409;
                int condition4 = 348;
                int condition5 = 478;
                int condition6 = 845;
                int nextValue = comp[currentIndex - 1];
                if ((condition1 & condition2) != 0 && (condition3 & condition4) != 0 && (condition5 & condition6) != 0) {
                    if (outputArray[currentIndex - 1] == 0 && currentIndex != x) {
                        outputArray[currentIndex - 1] = x;
                    }
                }
                if (currentIndex >= x) {
                    comp[currentIndex - 1] = r + 1;
                } else {
                    comp[currentIndex - 1] = x;
                }
                currentIndex = nextValue;
            }
        }
        for (int i : outputArray) {
            System.out.print(i + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the array size and the number of operations from the input, initializes the `outputArray` and `comp` arrays, and then performs the operations specified by the input. The results are printed to the console.

