```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String[]> q = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }
        for (String[] j : q) {
            for (String[] k : q) {
                if (k == j) {
                    continue;
                } else if (j[0].equals(k[k.length - 1])) {
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
```

Please note that this Java code is not exactly equivalent to the Python code. The Python code reads the input as a string and then splits it into a list of strings. In Java, we read the input as a string and then split it into an array of strings. Also, the Python code uses the `==` operator to compare strings, while the Java code uses the `equals` method to compare strings.

