Here is the Java version of the Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Character, Integer> dt = new HashMap<>();
    static int loopBoundary = 396;
    static int stopCondition = 395;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputList = input.toCharArray();
        recursiveCounter(0, loopBoundary / stopCondition, 1, inputList);
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && inputList.length % 2 == 0) {
            System.out.println("Second");
        } else if (!x && inputList.length % 2 != 0) {
            System.out.println("First");
        }
    }

    public static void recursiveCounter(int loopIndexOut, int stop, int step, char[] inputList) {
        if ((step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char c : inputList) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        recursiveCounter(loopIndexOut + step, stop, step, inputList);
    }
}
```

Please note that the Java version of the code does not include the t-test functionality from the Python version, as Java does not have a built-in function for this. If you need to use this functionality, you may need to implement it yourself or find a library that provides it.

