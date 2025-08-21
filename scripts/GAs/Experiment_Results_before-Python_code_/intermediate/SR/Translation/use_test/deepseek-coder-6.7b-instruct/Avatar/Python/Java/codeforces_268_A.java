Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> q = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = new String[2];
            a[0] = scanner.next();
            a[1] = scanner.next();
            q.add(a);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (q.get(i)[0].equals(q.get(j)[1])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of pairs from the input, then reads each pair into a String array and adds it to a list. It then iterates over the list, comparing each pair to every other pair. If the first element of one pair is the same as the last element of another pair, it increments a counter. Finally, it prints the count.

