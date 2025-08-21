```java
import java.util.*;

class Main {
    static int increment(int arg0, int arg1) {
        return arg0 + arg1;
    }

    static int decrement(int arg0, int arg1) {
        return arg0 - arg1;
    }

    static int increment_count(int high, int increment_amount) {
        return increment(high, increment_amount);
    }

    static int decrement_tower(int tower, int decrement_amount) {
        return decrement(tower, decrement_amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int high = 1;
        int tower = n;
        int maximum = 1;
        processList(l, n, high, tower, maximum, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    static void processList(int[] l, int n, int high, int tower, int maximum, int i) {
        if (i >= n || i < 0) {
            return;
        }
        if (l[i] == l[i - 1]) {
            int decrement_amount = 1;
            tower = decrement_tower(tower, decrement_amount);
            int increment_amount = 1;
            high = increment_count(high, increment_amount);
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        processList(l, n, high, tower, maximum, i + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and a list of `n` integers from the input, sorts the list, and then processes the list. It keeps track of the highest count and the number of towers, and prints the maximum count and the number of towers at the end.

