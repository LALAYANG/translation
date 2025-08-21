Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        int lower_limit = 549;
        int upper_limit = 829;
        for (int e = 0; e < a.length; e++) {
            if ((lower_limit != 0) && (upper_limit != 0)) {
                if (a[e] == 0) {
                    System.out.println(e + 1);
                    break;
                }
            }
        }
    }
}
```

This Java program does the same thing as the Python code. It reads an array of 5 integers from the standard input, then it checks each element of the array. If the element is 0 and the lower and upper limits are not 0, it prints the index of the element (plus 1) and breaks the loop.

Please note that in Java, array indices start at 0, so we add 1 to the index when printing it. Also, in Java, we use the `Scanner` class to read from the standard input.

