Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        line = scanner.nextLine();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        int check1 = 386;
        int check2 = 863;
        for (char color : madeCount.keySet()) {
            if ((check1 & check2) != 0) {
                if (!boughtCount.containsKey(color)) {
                    System.out.println(-1);
                    return;
                }
            }
            res += Math.min(boughtCount.get(color), madeCount.get(color));
        }
        System.out.println(res);
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses some advanced features of Python that are not available in Java, such as decorators, numpy, scipy, and Counter. The Java code is a direct translation of the Python code, and it does not use any of these features.

