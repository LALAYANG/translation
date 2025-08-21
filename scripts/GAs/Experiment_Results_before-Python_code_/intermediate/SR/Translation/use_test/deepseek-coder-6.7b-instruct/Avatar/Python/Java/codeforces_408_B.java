```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String line = "bbzmzqazmbambnmzaabznmbabzqnaabmabmnnabbmnzaanzzezebzabqaabzqaemeqqammmbazmmzaznnbbmeebmanbeemzmemqbaeebnqenqzzbanebmnzqqebqmmnmqqzmmeqqqaaezemmazqqmqaqnnqqzbzeeazammmenbbamzbmnaenemenaaaebnmanebqmqnznqbenmqqnnnaeaebqmamennmqqeaaqqbammnzqmnmqnqbbezmemznqmanzmmqzzzzembqnzqbanamezqaqbazenenqqznqaebzaeezbqqbmeeaqnmmbnqbbnmaqqemaeaezaabmbnbzzaae";
        String line2 = "bbzmzqazmbambnmzaabznmbabzqnaabmabmnnabbmnzaanzzezebzabqaabzqaemeqqammmbazmmzaznnbbmeebmanbeemzmemqbaeebnqenqzzbanebmnzqqebqmmnmqqzmmeqqqaaezemmazqqmqaqnnqqzbzeeazammmenbbamzbmnaenemenaaaebnmanebqmqnznqbenmqqnnnaeaebqmamennmqqeaaqqbammnzqmnmqnqbbezmemznqmanzmmqzzzzembqnzqbanamezqaqbazenenqqznqaebzaeezbqqbmeeaqnmmbnqbbnmaqqemaeaezaabmbnbzzaae";
        System.out.println(solution(line, line2));
    }

    public static int solution(String line, String line2) {
        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        for (char c : line2.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (char color : madeCount.keySet()) {
            if (!boughtCount.containsKey(color)) {
                return -1;
            }
            res += Math.min(boughtCount.get(color), madeCount.get(color));
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It counts the number of each character in two strings and then finds the minimum count of each character in the two strings. The result is the sum of these minimum counts. If a character is not present in one of the strings, the function returns -1.

