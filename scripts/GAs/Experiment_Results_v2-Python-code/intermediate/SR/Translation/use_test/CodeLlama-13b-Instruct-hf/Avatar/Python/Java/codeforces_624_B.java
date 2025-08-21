
The provided Python code is using the `scipy.stats` library to perform a two-sample t-test. The `ttest_ind` function is used to calculate the t-statistic and p-value for the two samples. The code then uses the `map` function to convert the input data to a list of integers, and the `sort` function to sort the list in descending order.

To translate this code to Java, we can use the `java.util.Arrays` class to perform the sorting and the `java.util.stream` package to perform the mapping. We can also use the `java.lang.Math` class to perform the calculations.

Here is the Java code:
```java
import java.util.Arrays;
import java.util.stream.IntStream;
import java.lang.Math;

public class TTest {
    public static void main(String[] args) {
        int[] a = {26, 243, 364, 768, 766, 633, 535, 502, 424, 502, 283, 592, 877, 137, 891, 837, 990, 681, 898, 831, 487, 595, 604, 747, 856, 805, 688};
        int[] b = {13, 33, 82, 44, 35, 76};

        // Sort the arrays in descending order
        Arrays.sort(a, (o1, o2) -> o2 - o1);
        Arrays.sort(b, (o1, o2) -> o2 - o1);

        // Calculate the t-statistic and p-value
        double t = Math.sqrt(a.length * b.length) * Math.sqrt(Math.pow(Math.sum(a) - Math.sum(b), 2) / (a.length * b.length));
        double p = 1 - Math.abs(t);

        // Print the results
        System.out.println("t-statistic: " + t);
        System.out.println("p-value: " + p);
    }
}
```
This code will perform the same calculations as the Python code, but it will use Java's built-in libraries and classes to perform the calculations.

Note that the `Math.sum` method is used to calculate the sum of the elements in the arrays, and the `Math.pow` method is used to calculate the power of a number. The `Math.sqrt` method is used to calculate the square root of a number.
