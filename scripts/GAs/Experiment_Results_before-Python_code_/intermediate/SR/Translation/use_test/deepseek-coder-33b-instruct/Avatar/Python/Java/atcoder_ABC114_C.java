```java
import java.util.HashSet;

public class Main {
    static int N = 777777752;

    public static void main(String[] args) {
        System.out.println(aaa("0"));
    }

    public static int aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = isValid(n) ? 1 : 0;
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i);
        }
        return ans;
    }

    public static boolean isValid(String n) {
        HashSet<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        return set.equals(new HashSet<>() {{
            add('7');
            add('5');
            add('3');
        }});
    }
}
```

