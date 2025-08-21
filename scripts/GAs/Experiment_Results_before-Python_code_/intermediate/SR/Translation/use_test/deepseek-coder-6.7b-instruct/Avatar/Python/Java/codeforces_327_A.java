Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine().replace(" ", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            ArrayList<Integer> indices = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    indices.add(i);
                }
            }
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.size(); i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        maximum = Math.max(maximum, 2 + 2 * (Math.abs(indices.indexOf(indices.get(i)) - indices.indexOf(indices.get(j))) - 1) - (Math.abs(indices.get(i) - indices.get(j)) - 1));
                    }
                }
                int countOnes = (int) s.chars().filter(ch -> ch == '1').count();
                System.out.println(countOnes + maximum);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and a string `s` from the input, and then it checks if '0' is in `s`. If it is, it finds all the indices of '0' in `s` and calculates the maximum value based on the indices. The result is printed out. If '0' is not in `s`, it just prints `n - 1`.

