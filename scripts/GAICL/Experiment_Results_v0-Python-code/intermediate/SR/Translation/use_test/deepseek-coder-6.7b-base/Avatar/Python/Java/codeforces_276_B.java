```
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        boolean isFirst = true;
        for (int count : charCountMap.values()) {
            if (count % 2 != 0) {
                if (isFirst) {
                    isFirst = false;
                } else {
                    System.out.println("Second");
                    return;
                }
            }
        }
        System.out.println("First");
    }
}
```

