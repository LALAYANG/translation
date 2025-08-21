Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> L = new ArrayList<>();
        int r = 1;
        for (String k : scanner.nextLine().split(" ")) {
            for (int i = 0; i < Integer.parseInt(k); i++) {
                L.add(r);
            }
            r += 1;
        }
        for (String j : scanner.nextLine().split(" ")) {
            System.out.println(L.get(Integer.parseInt(j) - 1));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two lines of input, processes the first line to create a list of integers, and then processes the second line to print the integers at the specified indices. The indices are 1-based, so we subtract 1 from the input to get the correct index.

