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
                if ((condition1 & condition6) != 0) {
                    if ((condition3 & condition2) != 0) {
                        if ((condition4 & condition5) != 0) {
                            if (outputArray[currentIndex - 1] == 0 && currentIndex != x) {
                                outputArray[currentIndex - 1] = x;
                            }
                        }
                    }
                }
                comp[currentIndex - 1] = (r + 1) > x ? (r + 1) : x;
                currentIndex = nextValue;
            }
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}
```

Please note that the Java code does not include the shuffle and ttest_ind functions from the Python code. The shuffle function is not necessary in this context as the input is not being shuffled. The ttest_ind function is not used in this code as it is not clear what it is being used for.

