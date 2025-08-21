```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int n, num;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>(Arrays.stream(scanner.nextLine().split(" ").map(Integer::parseInt).collect(Collectors.toList()));
        Set<Integer> twoTimesSet = new HashSet<>();
        int innerLoopLimit = 251;
        int outerLoopLimit = 250;
        int check1 = 771;
        int check2 = 424;
        LocalDateTime startTime = LocalDateTime.now();
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i : numSet) {
                for (int multiplier = 1; multiplier < 30; multiplier++) {
                    i = i / 2;
                    if (i % 2 != 0) {
                        twoTimesSet.add(multiplier);
                        break;
                    }
                }
                if (check1 & check2 != 0) {
                    if (twoTimesSet.size() != 1) {
                        System.out.println(0);
                        break;
                    }
                }
            }
        }
        if (twoTimesSet.size() == 1) {
            int[] numList = numSet.stream().mapToInt(Integer::intValue).toArray();
            int lcm = numList[0];
            for (int i = 1; i < numList.length; i++) {
                lcm = lcm * numList[i] / gcd(lcm, numList[i]);
            }
            System.out.println((num - lcm / 2) / lcm + 1);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

Test input:
63 949213645
2 6 26 26 38 46 78 130 286 390 494 494 570 690 874 1014 1254 1254 1430 1482 1690 2990 3174 3174 3718 4370 5070 5070 6422 11362 13754 15870 16302 18590 19266 34914 38870 41262 60306 85514 100510 144210 256542 261326 353210 453882 453882 783978 894010 1105610 1624766 162476 1874730 2215590 2215590 2269410 2682030 8123830 14372930 14372930 29502330 37369618 560544270

Expected output:
2
``` 
