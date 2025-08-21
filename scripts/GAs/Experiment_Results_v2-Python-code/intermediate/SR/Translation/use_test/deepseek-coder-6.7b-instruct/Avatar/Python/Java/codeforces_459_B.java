Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = scanner.nextInt();
        }
        Arrays.sort(NewList);
        int a = NewList[n - 1];
        int b = NewList[0];
        if (a == b) {
            System.out.println(a - b + " " + n * (n - 1) / 2);
        } else {
            int MaxCount = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (NewList[i] == a) {
                    MaxCount++;
                }
                if (NewList[i] == b) {
                    bc++;
                }
            }
            System.out.println(a - b + " " + MaxCount * bc);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then calculates the difference between the maximum and minimum values and the count of these values in the list. The result is printed to the standard output.

Please note that the `SixthChecker`, `FifthChecker`, `ThirdChecker`, `FirstChecker`, `FourthChecker`, and `SecondChecker` variables in your Python code are not defined in the provided code, so I removed them.

