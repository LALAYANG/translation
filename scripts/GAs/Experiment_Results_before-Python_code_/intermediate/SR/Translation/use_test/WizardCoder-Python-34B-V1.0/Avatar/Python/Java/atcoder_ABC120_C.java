```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.chars().distinct().count() == 1) {
            System.out.println(0);
            return;
        }
        Map<Character, Integer> a = new HashMap<>();
        for (char c : s.toCharArray()) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (int count : a.values()) {
            ans = Math.min(ans, count);
        }
        ans *= 2;
        System.out.println(ans);
    }
}
``` 
