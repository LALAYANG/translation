```
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Check if the input string has exactly two unique characters
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        if (charCounts.size() != 2) {
            System.out.println("No");
            return;
        }

        // Check if the two unique characters have the same frequency
        int freq1 = charCounts.get(input.charAt(0));
        int freq2 = charCounts.get(input.charAt(1));
        if (freq1 != freq2) {
            System.out.println("No");
            return;
        }

        // Check if the two unique characters are adjacent in the input string
        int index1 = input.indexOf(input.charAt(0));
        int index2 = input.indexOf(input.charAt(1));
        if (Math.abs(index1 - index2) != 1) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}
```

