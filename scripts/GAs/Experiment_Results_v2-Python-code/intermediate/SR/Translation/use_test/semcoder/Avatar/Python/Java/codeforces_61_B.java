Thought process:
1. The code defines a function `f(s)` that processes a string `s` and returns a processed string.
2. The `solve()` function reads inputs using `read_inputs()`, generates permutations, and checks if the input strings are valid.
3. The `check_inputs()` function checks if the input strings are valid based on the generated permutations.

Solution:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> permutationsList = new ArrayList<>();

        // Read inputs and generate permutations
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            permutationsList.add(f(input));
        }
        List<String> allPermutations = new ArrayList<>();
        generatePermutations("", permutationsList, allPermutations);

        // Check if input strings are valid
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            if (allPermutations.contains(f(input))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String processedString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '-' && c != ';' && c != '_') {
                processedString += Character.toLowerCase(c);
            }
        }
        return processedString;
    }

    public static void generatePermutations(String prefix, List<String> remaining, List<String> allPermutations) {
        if (remaining.isEmpty()) {
            allPermutations.add(prefix);
        } else {
            for (int i = 0; i < remaining.size(); i++) {
                generatePermutations(prefix + remaining.get(i), remaining.subList(0, i) + remaining.subList(i + 1, remaining.size()), allPermutations);
            }
        }
    }
}
```
