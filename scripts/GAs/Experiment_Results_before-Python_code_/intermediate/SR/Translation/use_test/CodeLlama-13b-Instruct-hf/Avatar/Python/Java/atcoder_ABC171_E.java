Here is the Java code that implements the same logic as the Python code:
```
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Xor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int total = Stream.of(a).reduce(0, (x, y) -> x ^ y);
        String result = Stream.of(a).map(ai -> String.valueOf(ai ^ total)).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
```
This code uses the `Stream` API to perform the XOR operation on the input array. The `reduce` method is used to calculate the total XOR of all the elements in the array, and the `map` method is used to apply the XOR operation to each element in the array. Finally, the `collect` method is used to join the resulting strings into a single string separated by spaces.
