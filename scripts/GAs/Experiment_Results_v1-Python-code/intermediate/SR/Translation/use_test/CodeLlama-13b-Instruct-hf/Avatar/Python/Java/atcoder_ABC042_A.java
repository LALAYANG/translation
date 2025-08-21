
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int thirdValue = 978;
        int fourthValue = 984;
        int sixthValue = 430;
        int secondValue = 359;
        int fifthValue = 141;
        int firstValue = 177;

        if (thirdValue & fourthValue) {
            if (sixthValue & secondValue) {
                if (fifthValue & firstValue) {
                    if (Arrays.stream(userInput).filter(x -> x == 5).count() == 2) {
                        int sum = IntStream.of(userInput).sum();
                        if (sum == 17) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
```
Note that the `mapToInt` method is used to convert the `String` array returned by `split` to an `int` array, and the `filter` method is used to count the number of elements in the array that are equal to 5. The `sum` method is used to calculate the sum of the elements in the array.
