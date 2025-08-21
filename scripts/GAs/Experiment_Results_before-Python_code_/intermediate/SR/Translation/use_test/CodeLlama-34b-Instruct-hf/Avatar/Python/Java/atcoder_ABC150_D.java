```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class TwoTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(sc.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int i : numSet) {
            for (int j = 1; j <= 30; j++) {
                i /= 2;
                if (i % 2 != 0) {
                    twoTimesSet.add(j);
                    break;
                }
            }
        }
        if (twoTimesSet.size() != 1) {
            System.out.println(0);
        } else {
            int[] numList = numSet.toArray(new int[numSet.size()]);
            int lcm = numList[0];
            for (int i = 1; i < numList.length; i++) {
                lcm = lcm * numList[i] / fractions.gcd(lcm, numList[i]);
            }
            System.out.println((num - lcm / 2) / lcm + 1);
        }
    }
}
```
Note: The `fractions` module is not available in Java, so you will need to use a different library or implement the GCD function yourself.
