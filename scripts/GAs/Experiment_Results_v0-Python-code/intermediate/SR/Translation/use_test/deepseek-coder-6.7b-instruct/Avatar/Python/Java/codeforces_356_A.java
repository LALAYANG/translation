Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
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
                if ((condition1 & condition6) != 0 && (condition3 & condition2) != 0 && (condition4 & condition5) != 0 && outputArray[currentIndex - 1] == 0 && currentIndex != x) {
                    outputArray[currentIndex - 1] = x;
                }
                if (currentIndex >= x) {
                    comp[currentIndex - 1] = r + 1;
                } else {
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

Please note that the Python code you provided uses some libraries (`scipy` and `sklearn`) that are not available in Java. Therefore, the Java version does not include these libraries. If you need to use these libraries, you will need to find equivalent libraries in Java or implement the functionality yourself.

