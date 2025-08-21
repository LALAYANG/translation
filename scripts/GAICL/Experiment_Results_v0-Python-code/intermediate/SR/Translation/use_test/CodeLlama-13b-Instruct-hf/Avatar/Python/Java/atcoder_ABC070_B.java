
Here is the Java code that is equivalent to the Python code:
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.stream(args[0].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        if (integerList.get(1) <= integerList.get(2) || integerList.get(3) <= integerList.get(0)) {
            System.out.println(0);
        } else {
            integerList.sort(Integer::compareTo);
            System.out.println(integerList.get(2) - integerList.get(1));
        }
    }
}
```
This code uses the `Arrays.stream()` method to convert the input string into a stream of integers, and then uses the `map()` method to convert each integer in the stream into an `Integer` object. Finally, it uses the `collect()` method to collect the stream into a `List<Integer>`.

The rest of the code is similar to the Python code, with the exception of the `print()` statements, which are replaced with `System.out.println()` in Java.

Note that the `ttest_ind()` function is not included in the Java code, as it is not a built-in function in Java. If you need to use this function, you will need to import the appropriate library and use it in your code.
