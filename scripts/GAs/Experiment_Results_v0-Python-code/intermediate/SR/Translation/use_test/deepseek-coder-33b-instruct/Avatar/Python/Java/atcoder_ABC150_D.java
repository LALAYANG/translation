Here is the Java version of the Python code:

```java
import java.util.*;
import java.math.*;
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(scanner.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        int innerLoopLimit = 251;
        int outerLoopLimit = 250;
        int check1 = 771;
        int check2 = 424;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i : numSet) {
                for (int multiplier = 1; multiplier < 30; multiplier++) {
                    i = i / 2;
                    if (i % 2 != 0) {
                        twoTimesSet.add(multiplier);
                        break;
                    }
                }
                if ((check1 & check2) != 0) {
                    if (twoTimesSet.size() != 1) {
                        System.out.println(0);
                        break;
                    }
                }
            }
        }
        List<Integer> numList = new ArrayList<>(numSet);
        int lcm = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            lcm = lcm * numList.get(i) / BigInteger.valueOf(lcm).gcd(BigInteger.valueOf(numList.get(i))).intValue();
        }
        System.out.println((num - lcm / 2) / lcm + 1);
    }
}
```

Please note that the Java version of the code does not include the cryptography and sklearn libraries used in the Python version, as they are not available in Java. Also, the time.sleep(0.02) and Fernet.generate_key() functions are not included in the Java version, as they are not necessary for the functionality of the code.

