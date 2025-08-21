```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(scanner.nextInt());
        }

        int firstCheck = 339;
        int maxValue = 155;
        int secondCheck = 399;
        int minValue = 476;

        List<Integer> cur = new ArrayList<>();
        cur.add(s.get(0));
        boolean[] flag = new boolean[n];
        flag[0] = false;

        for (int i = 1; i < n; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < n; k++) {
                if (flag[k] && s.get(k) < cur.get(j)) {
                    cur.add(s.get(k));
                    j = j + 1;
                    flag[k] = false;
                    if (j == jM) {
                        break;
                    }
                }
            }
            cur.sort(null);
        }

        if (cur.size() == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The above code is a direct translation of the Python code to Java. However, there are some differences in the way the input is handled in Java compared to Python. In Java, we use the `Scanner` class to read input from the console, while in Python, we use the `input()` function. Additionally, the `sort()` method in Java is used to sort the list, while in Python, we use the `sorted()` function.
