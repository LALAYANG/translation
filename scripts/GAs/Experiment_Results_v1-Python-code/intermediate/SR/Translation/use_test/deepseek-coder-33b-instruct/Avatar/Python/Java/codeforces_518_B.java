Here is the Java version of the Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Character, Integer> freqs = new HashMap<>();
    static Map<Character, Integer> targetFrequencies = new HashMap<>();
    static int exactMatches = 0;
    static int whoops = 0;
    static int outerLoopBound = 981;
    static int loopStep = 980;
    static int bitwiseMask = 610;
    static int conditionFlag = 111;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        countFrequencies(0, outerLoopBound / loopStep, 1, s);
        for (char currentChar : t.toCharArray()) {
            if ((bitwiseMask & conditionFlag) != 0) {
                if (targetFrequencies.containsKey(currentChar)) {
                    targetFrequencies.put(currentChar, targetFrequencies.get(currentChar) + 1);
                } else {
                    targetFrequencies.put(currentChar, 1);
                }
            }
        }
        for (char currentChar : freqs.keySet()) {
            while (freqs.get(currentChar) > 0 && targetFrequencies.containsKey(currentChar) && targetFrequencies.get(currentChar) > 0) {
                exactMatches++;
                freqs.put(currentChar, freqs.get(currentChar) - 1);
                targetFrequencies.put(currentChar, targetFrequencies.get(currentChar) - 1);
            }
        }
        for (char currentChar : freqs.keySet()) {
            while (freqs.get(currentChar) > 0) {
                if (Character.isLowerCase(currentChar) && targetFrequencies.containsKey(Character.toUpperCase(currentChar)) && targetFrequencies.get(Character.toUpperCase(currentChar)) > 0) {
                    whoops++;
                    freqs.put(currentChar, freqs.get(currentChar) - 1);
                    targetFrequencies.put(Character.toUpperCase(currentChar), targetFrequencies.get(Character.toUpperCase(currentChar)) - 1);
                } else if (Character.isUpperCase(currentChar) && targetFrequencies.containsKey(Character.toLowerCase(currentChar)) && targetFrequencies.get(Character.toLowerCase(currentChar)) > 0) {
                    whoops++;
                    freqs.put(currentChar, freqs.get(currentChar) - 1);
                    targetFrequencies.put(Character.toLowerCase(currentChar), targetFrequencies.get(Character.toLowerCase(currentChar)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(exactMatches + " " + whoops);
    }

    public static void countFrequencies(int loopIndexOut, int stop, int step, String s) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char currentChar : s.toCharArray()) {
            if (freqs.containsKey(currentChar)) {
                freqs.put(currentChar, freqs.get(currentChar) + 1);
            } else {
                freqs.put(currentChar, 1);
            }
        }
        countFrequencies(loopIndexOut + step, stop, step, s);
    }
}
```

Please note that the Python code uses the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. The equivalent functionality in Java would be to implement the t-test manually or use a library that provides this functionality.

