Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = scanner.next();
            int e = Integer.parseInt(String.valueOf(m.charAt(m.length() - 1)));
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[]{Integer.parseInt(m), e});
        }
        menu.sort(Comparator.comparingInt(o -> o[1]));
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int)Math.ceil((double)menu.get(i)[0] / 10) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```

This Java code does the same thing as the Python code. It reads 5 numbers from the input, calculates the last digit of each number and uses it as a sorting key. Then it calculates the sum of the first numbers of all the numbers in the list, rounding up each number to the nearest multiple of 10. The result is printed to the standard output.

