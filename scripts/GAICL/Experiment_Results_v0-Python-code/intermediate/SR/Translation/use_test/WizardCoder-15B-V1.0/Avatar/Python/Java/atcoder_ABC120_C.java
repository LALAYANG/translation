```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int check123 = 37;
        int check223 = 853;
        int check121 = 334;
        int check221 = 584;
        int check119 = 897;
        int check219 = 785;
        String s = sc.nextLine();
        if ((check123 & check223) != 0) {
            if ((check121 & check221) != 0) {
                if ((check119 & check219) != 0) {
                    if (new HashSet<Character>(s.toCharArray()).size() == 1) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }
        ttest_ind(new double[]{64, 35, 49}, new double[]{16, 1, 77});
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (int val : map.values()) {
            ans = Math.min(ans, val * 2);
        }
        System.out.println(ans);
    }
}

```
