```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newn_1 = scanner.nextInt();
        int newnum_1 = scanner.nextInt();
        Set<Integer> num_set = new HashSet<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet()));
        Set<Integer> two_times_set = new HashSet<>();
        int ConditionChecker112 = 231;
        int newConditionChecker212_1 = 684;
        int ConditionChecker114 = 313;
        int ConditionChecker214 = 33;
        int ConditionChecker116 = 282;
        int ConditionChecker216 = 211;
        int ConditionChecker115 = 633;
        int ConditionChecker215 = 912;
        int ConditionChecker117 = 844;
        int ConditionChecker217 = 527;
        for (int newi_1 : num_set) {
            for (int j = 1; j < 30; j++) {
                newi_1 = newi_1 / 2;
                if (ConditionChecker117 & ConditionChecker217 != 0) {
                    if (ConditionChecker115 & ConditionChecker215 != 0) {
                        if (newi_1 % 2 != 0) {
                            two_times_set.add(j);
                            break;
                        }
                    }
                }
            }
            if (ConditionChecker116 & ConditionChecker216 != 0) {
                if (ConditionChecker114 & ConditionChecker214 != 0) {
                    if (ConditionChecker112 & newConditionChecker212_1 != 0) {
                        if (two_times_set.size() != 1) {
                            System.out.println(0);
                            break;
                        }
                    }
                }
            }
        }
        int[] num_list = num_set.stream().mapToInt(Integer::intValue).toArray();
        int lcm = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            lcm = lcm * num_list[i] / gcd(lcm, num_list[i]);
        }
        System.out.println((newnum_1 - lcm / 2) / lcm + 1);
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
