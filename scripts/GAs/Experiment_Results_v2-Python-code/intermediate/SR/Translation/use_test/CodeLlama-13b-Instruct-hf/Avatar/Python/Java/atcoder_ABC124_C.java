
Here is the Java code that translates the Python code:
```java
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PythonToJava {
    public static void main(String[] args) {
        String inputString = "10010010";
        List<Integer> inputList = Arrays.stream(inputString.split("")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.shuffle(inputList);
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < inputList.size(); i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(Math.min(inputList.size() - evenCount - oddCount, inputList.size() - evenCount - oddCount));
    }
}
```
This code uses the `Collections.shuffle()` method to shuffle the input list, and then it counts the number of even and odd digits in the list using a for loop. Finally, it prints the minimum of the two expressions.

Note that the `Arrays.stream()` method is used to convert the input string into a list of integers, and the `Collectors.toList()` method is used to collect the stream into a list. The `Integer::parseInt()` method is used to convert each character in the input string into an integer.
