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
            if ((lower_limit & upper_limit) != 0) {
                if (a[e] == 0) {
                    System.out.println(e + 1);
                    break;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a list of 5 integers from the standard input, checks if the bitwise AND of the lower and upper limits is non-zero, and if so, checks if the current element is zero. If it is, it prints the index of the element (plus one) and breaks the loop.

