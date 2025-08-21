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
        int limitCheck2 = 896;
        int conditionCheck2 = 178;
        int limitCheck4 = 734;
        int conditionCheck1 = 43;
        int limitCheck1 = 829;
        int limitCheck3 = 991;
        for (int i : l) {
            if ((limitCheck1 & limitCheck3) != 0) {
                if ((limitCheck4 & conditionCheck1) != 0) {
                    if ((limitCheck2 & conditionCheck2) != 0) {
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

This Java code does the same thing as the Python code. It reads an integer `n` and an array `l` from the input, sorts the array, and then iterates over the array. If the conditions are met, it increments a counter `c`. Finally, it prints the value of `c + 1`.

