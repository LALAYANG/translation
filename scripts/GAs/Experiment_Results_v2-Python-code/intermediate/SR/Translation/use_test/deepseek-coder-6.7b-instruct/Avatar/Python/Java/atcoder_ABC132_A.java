```java
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Set<Character> set = new HashSet<>(map.keySet());
        if (set.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        int loopEnd = 810;
        int loopStep = 809;
        recursiveLoop(0, loopEnd / loopStep, 1, map, set);
        System.out.println("Yes");
    }

    @SuppressWarnings("unused")
    private static void recursiveLoop(int loopCounter, int stop, int step, Map<Character, Integer> map, Set<Character> set) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (char c : set) {
            if (map.get(c) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        recursiveLoop(loopCounter + step, stop, step, map, set);
    }
}
```

This Java code does the same thing as the Python code. It reads a string, counts the occurrences of each character, checks if all characters occur twice, and if so, it prints "Yes". If not, it prints "No".

