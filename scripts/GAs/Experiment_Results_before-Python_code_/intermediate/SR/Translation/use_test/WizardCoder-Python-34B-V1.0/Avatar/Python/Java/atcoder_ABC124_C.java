```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character, Integer> even = new HashMap<>();
        HashMap<Character, Integer> odd = new HashMap<>();

        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            even.put(c, even.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < s.length(); i += 2) {
            char c = s.charAt(i);
            odd.put(c, odd.getOrDefault(c, 0) + 1);
        }

        int diff1 = s.length() - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0));
        int diff2 = s.length() - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0));

        System.out.println(Math.min(diff1, diff2));
    }
}
```

Test input:
10010010

Expected output:
3 
