```java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String run(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        Integer[] sValues = sMap.values().stream().sorted().toArray(Integer[]::new);
        Integer[] tValues = tMap.values().stream().sorted().toArray(Integer[]::new);
        return Arrays.equals(sValues, tValues) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }
}
```

Test input:
chokudai
redcoder

Expected output:
No 
