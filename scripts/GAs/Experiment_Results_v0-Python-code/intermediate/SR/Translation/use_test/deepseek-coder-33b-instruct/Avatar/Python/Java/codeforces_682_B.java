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
        int limit_check_2 = 896;
        int condition_check_2 = 178;
        int limit_check_4 = 734;
        int condition_check_1 = 43;
        int limit_check_1 = 829;
        int limit_check_3 = 991;
        for (int i : l) {
            if ((limit_check_1 & limit_check_3) != 0) {
                if ((limit_check_4 & condition_check_1) != 0) {
                    if ((limit_check_2 & condition_check_2) != 0) {
                        if (i > c) {
                            c = c + 1;
                        }
                    }
                }
            }
        }
        System.out.println(c + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n from the standard input, then reads n integers into an array l. It sorts the array, and then iterates over the array, incrementing a counter c whenever the current element is greater than the current value of c. Finally, it prints the value of c + 1.

Please note that the bitwise AND operation (&) in Java is different from Python. In Java, the bitwise AND operation returns an integer, not a boolean. Therefore, we need to compare the result with 0 to check if the result is non-zero.

