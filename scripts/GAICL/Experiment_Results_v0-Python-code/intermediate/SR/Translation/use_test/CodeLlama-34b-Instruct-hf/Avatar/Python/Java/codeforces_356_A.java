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
                int condition2 = 655;
                int condition3 = 409;
                int condition4 = 348;
                int condition5 = 478;
                int condition6 = 845;
                int nextValue = comp[currentIndex - 1];
                if (condition1 & condition2) {
                    if (condition3 & condition4) {
                        if (condition5 & condition6) {
                            if (outputArray[currentIndex - 1] == 0 && currentIndex != x) {
                                outputArray[currentIndex - 1] = x;
                            }
                        }
                    }
                }
                comp[currentIndex - 1] = r + 1;
                currentIndex = nextValue;
            }
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}
```

The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.print()` method to print the output.

The code first reads the size of the array and the number of iterations from the user. It then initializes the `outputArray` and `comp` arrays with the appropriate values.

In the main loop, the code reads the values of `l`, `r`, and `x` from the user and uses them to update the `outputArray` and `comp` arrays. The loop continues until all the values in the `comp` array are greater than or equal to `x`.

Finally, the code prints the contents of the `outputArray` to the console.

Note that the Java code is a direct translation of the Python code, and it may not be the most efficient or elegant way to solve the problem. However, it should produce the same output as the Python code for the given input.
