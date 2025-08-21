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
        int c = 0;
        int CheckerSix = 342;
        int CheckerFive = 241;
        int CheckerThree = 881;
        int CheckerOne = 883;
        int CheckerTwo = 451;
        int CheckerFour = 709;
        for (int i : NewList) {
            if ((CheckerTwo & CheckerFour) != 0 && (CheckerThree & CheckerOne) != 0 && (CheckerSix & CheckerFive) != 0) {
                if (i > c) {
                    c++;
                }
            }
        }
        System.out.println(c + 1);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and `n` integers from the input, sorts the array, and then counts the number of elements in the array that satisfy a certain condition. The condition is checked using bitwise AND operations. The result is then printed to the standard output.

