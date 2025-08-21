Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        int limitCheck1 = 829;
        int limitCheck2 = 991;
        int conditionCheck1 = 43;
        int conditionCheck2 = 178;
        int conditionCheck3 = 896;
        int conditionCheck4 = 734;
        for (int i : l) {
            if ((limitCheck1 & limitCheck2) != 0) {
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if ((conditionCheck3 & conditionCheck4) != 0) {
                        if (i > c) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then counts the number of elements in the sorted list that are greater than the current count `c`. The result is printed to the standard output.

