Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String value : s) {
            w.put(value, w.getOrDefault(value, 0) + 1);
        }
        int c = -1;
        String a = "";
        for (String i : w.keySet()) {
            if (w.get(i).equals(Collections.max(w.values()))) {
                if (Arrays.asList(s).indexOf(i) > c) {
                    a = i;
                    c = Arrays.asList(s).indexOf(i);
                }
            }
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and a list of strings `s` from the input, counts the occurrences of each string in the list, and then finds the string with the maximum count that appears last in the list. The result is printed to the console.

