```
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class XorOperation {
    public static void main(String[] args) {
        int arraySize = Integer.parseInt(args[0]);
        int[] inputArray = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int xorSum = Arrays.stream(inputArray).reduce(0, (a, b) -> a ^ b);
        List<Integer> xorResult = Arrays.stream(inputArray).map(ai -> xorOperation(ai, xorSum)).collect(Collectors.toList());
        System.out.println(xorResult);
    }

    public static int xorOperation(int a, int b) {
        return a ^ b;
    }
}
```
Note: The above code uses Java 8's Stream API to perform the XOR operation and the reduce operation. If you are using an older version of Java, you may need to use a different approach.
