
Here is the Java code that produces the same output as the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(scanner.nextInt());
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
            return;
        }
        List<Integer> numList = new ArrayList<>(numSet);
        int lcm = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            lcm = lcm * numList.get(i) / fractions.gcd(lcm, numList.get(i));
        }
        System.out.println((num - lcm / 2) / lcm + 1);
    }
}
```
Note that the `fractions.gcd` method is not available in Java, so I had to use a different method to calculate the greatest common divisor (GCD) of two numbers. The `gcd` method in the Python code is from the `fractions` module, which is not available in Java.
