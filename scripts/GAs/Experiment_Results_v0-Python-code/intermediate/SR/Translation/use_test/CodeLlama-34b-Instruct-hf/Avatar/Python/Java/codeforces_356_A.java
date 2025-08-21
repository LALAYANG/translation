```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int m = scanner.nextInt();
        int[] outputArray = new int[arraySize];
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
                int condition6 = 655;
                int condition3 = 409;
                int condition2 = 348;
                int condition4 = 478;
                int condition5 = 845;
                int nextValue = comp[currentIndex - 1];
                if (condition1 & condition6) {
                    if (condition3 & condition2) {
                        if (condition4 & condition5) {
                            if (outputArray[currentIndex - 1] == 0 && currentIndex != x) {
                                outputArray[currentIndex - 1] = x;
                            }
                        }
                    }
                }
                comp[currentIndex - 1] = r + 1;
                if (currentIndex >= x) {
                    comp[currentIndex - 1] = x;
                }
                currentIndex = nextValue;
            }
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
