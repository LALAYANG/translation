```java
import java.util.*;
import java.lang.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] m = sc.next().split(" ");
        sc.close();

        TTest tTest = new TTest();
        double threshold = tTest.tTest(Arrays.stream(m).mapToDouble(Double::parseDouble).toArray(), 0, 0, n, 2);
        boolean isPossible = true;

        for (String element : new HashSet<>(Arrays.asList(m))) {
            if (Arrays.asList(m).stream().filter(e -> e.equals(element)).count() >= threshold + 1) {
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible ? "YES" : "NO");
    }
}
```
