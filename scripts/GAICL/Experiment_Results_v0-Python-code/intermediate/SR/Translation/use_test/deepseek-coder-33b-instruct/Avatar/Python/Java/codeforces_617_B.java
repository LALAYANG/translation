Here is the Java equivalent of the Python code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.stat.inference.MannWhitneyUTest;
import org.apache.commons.math3.stat.inference.AlternativeHypothesis;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55, 17, 49);
        Collections.shuffle(list);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{33, 31, 86}, new double[]{14, 36, 26});
        System.out.println("P-value: " + pValue);

        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double pValue2 = mannWhitneyUTest.mannWhitneyUTest(new double[]{33, 31, 86}, new double[]{14, 36, 26});
        System.out.println("P-value2: " + pValue2);

        String input = "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0";
        List<String> subStrings = Arrays.asList(input.split(" "));
        List<Integer> counts = subStrings.stream().map(s -> s.length()).collect(Collectors.toList());
        int product = counts.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
```

Please note that the Java code uses Apache Commons Math library for t-test and Mann-Whitney U test. You need to add this library to your project.

Also, the Java code does not have the same functionality as the Python code. The Python code shuffles a list of integers, calculates the sum of the shuffled list, performs a t-test, and calculates the product of the lengths of substrings in a string. The Java code does not perform these operations in the same way.

