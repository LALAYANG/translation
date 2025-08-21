```
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        if (charCount.size() != 2) {
            System.out.println("No");
            return;
        }

        int loopEnd = 810;
        int loopStep = 809;
        for (int i = 0; i < loopEnd; i += loopStep) {
            if (charCount.getOrDefault('A', 0) != 2 || charCount.getOrDefault('V', 0) != 2) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
```

