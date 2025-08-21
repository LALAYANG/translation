
```
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

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
        if (map.size() != 2) {
            System.out.println("No");
            return;
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

```

