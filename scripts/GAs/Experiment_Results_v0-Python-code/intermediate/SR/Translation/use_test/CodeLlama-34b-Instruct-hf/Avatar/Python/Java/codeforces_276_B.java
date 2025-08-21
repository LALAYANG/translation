```java
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Character> s = new ArrayList<>();
        for (char c : input.toCharArray()) {
            s.add(c);
        }

        Map<Character, Integer> dt = new HashMap<>();
        int loopBound = 704;
        int stepSize = 703;

        countChars(0, loopBound / stepSize, 1, dt);

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
        } else if (!x && s.size() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.size() % 2 != 0) {
            System.out.println("First");
        }
    }

    public static void countChars(int loopIndexOut, int stop, int step, Map<Character, Integer> dt) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char c : s) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        countChars(loopIndexOut + step, stop, step, dt);
    }
}
```
Note: The `ttest_ind` function from the Python code is not included in the Java code, as it is not a standard Java function. If you need to use this function in Java, you will need to find a Java implementation of it or write your own.
