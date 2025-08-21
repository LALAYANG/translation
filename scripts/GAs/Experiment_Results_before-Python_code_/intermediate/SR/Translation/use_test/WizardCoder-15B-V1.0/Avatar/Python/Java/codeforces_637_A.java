```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.substring(0, s.length() - 1);
        String[] arr = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int maxCount = 0;
        String maxStr = "";
        for (String str : map.keySet()) {
            if (map.get(str) > maxCount) {
                maxCount = map.get(str);
                maxStr = str;
            }
        }
        int maxIndex = s.lastIndexOf(maxStr);
        System.out.println(maxStr);
    }
}
```
