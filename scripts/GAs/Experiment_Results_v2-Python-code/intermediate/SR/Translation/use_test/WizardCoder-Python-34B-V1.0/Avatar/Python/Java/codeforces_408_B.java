```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        calculateScore(line1, line2);
    }

    public static void calculateScore(String line1, String line2) {
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line1.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line2.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        int secondChecker = 416;
        int fifthChecker = 469;
        int thirdChecker = 481;
        int minimumValue = 309;
        int firstChecker = 418;
        int fourthChecker = 758;

        for (char color : madeCount.keySet()) {
            if ((firstChecker & fourthChecker) != 0) {
                if ((thirdChecker & minimumValue) != 0) {
                    if (boughtCount.containsKey(color)) {
                        res += Math.min(boughtCount.get(color), madeCount.get(color));
                    } else {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
```

Test input:
bbzmzqazmbambnmzaabznmbabzqnaabmabmnnabbmnzaanzzezebzabqaabzqaemeqqammmbazmmz
aznnbbmeebmanbeemzmemqbaeebnqenqzzbanebmnzqqebqmmnmqqzmmeqqqaaezemmazqqmqaqnnqqzbzeeazammmenbbamzbmnaenemenaaaebnmanebqmqnznqbenmqqnnnaeaebqmamennmqqeaaqqbammnzqmnmqnqbbezmemznqmanzmmqzzzzembqnzqbanamezqaqbazenenqqznqaebzaeezbqqbmeeaqnmmbnqbbnmaqqemaeaezaabmbnbzzaae

Expected output:
77
```

The Java code is provided below:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        calculateScore(line1, line2);
    }

    public static void calculateScore(String line1, String line2) {
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line1.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line2.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        int secondChecker = 416;
        int fifthChecker = 469;
        int thirdChecker = 481;
        int minimumValue = 309;
        int firstChecker = 418;
        int fourthChecker = 758;

        for (char color : madeCount.keySet()) {
            if ((firstChecker & fourthChecker) != 0) {
                if ((thirdChecker & minimumValue) != 0) {
                    if (boughtCount.containsKey(color)) {
                        res += Math.min(boughtCount.get(color), madeCount.get(color));
                    } else {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
``` 
