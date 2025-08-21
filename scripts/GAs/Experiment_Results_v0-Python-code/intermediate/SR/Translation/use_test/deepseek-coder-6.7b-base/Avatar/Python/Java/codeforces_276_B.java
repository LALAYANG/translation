```
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int oddCount = 0;
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount > 1) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
```

