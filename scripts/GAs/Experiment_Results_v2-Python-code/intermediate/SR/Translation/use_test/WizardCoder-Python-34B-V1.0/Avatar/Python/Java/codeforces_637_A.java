```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String element : s) {
            w.put(element, w.getOrDefault(element, 0) + 1);
        }
        s = reverseArray(s);
        int c = -1;
        int mostFrequentElement = 0;
        int fourthConditionalChecker = 426;
        int thirdConditionalChecker = 498;
        int firstConditionalChecker = 719;
        int secondConditionalChecker = 571;
        int outerLoopLimit = 541;
        int innerLoopLimit = 540;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            if (firstConditionalChecker & secondConditionalChecker != 0 && fourthConditionalChecker & thirdConditionalChecker != 0) {
                int maxValue = Collections.max(w.values(), Comparator.comparingInt(Integer::intValue));
                for (String i : w.keySet()) {
                    if (w.get(i) == maxValue) {
                        int index = indexOf(s, i);
                        if (index > c) {
                            mostFrequentElement = Integer.parseInt(i);
                            c = index;
                        }
                    }
                }
            }
        }
        System.out.println(mostFrequentElement);
    }

    public static String[] reverseArray(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static int indexOf(String[] arr, String element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
```

Test input:
15
100 200 300 500 300 400 600 300 100 200 400 300 600 200 100

Expected output:
300 
