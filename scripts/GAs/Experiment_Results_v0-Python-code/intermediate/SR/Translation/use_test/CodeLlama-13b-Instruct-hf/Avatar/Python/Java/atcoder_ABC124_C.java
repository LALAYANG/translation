
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        List<Integer> inputList = Arrays.stream(inputString.split("")).map(Integer::parseInt).collect(Collectors.toList());
        Map<Integer, Integer> evenCounts = countEvenDigits(inputList);
        Map<Integer, Integer> oddCounts = countOddDigits(inputList);
        int min = Math.min(len(inputList) - calculateSum(evenCounts.get("0"), oddCounts.get("1")), len(inputList) - (evenCounts.get("1") + oddCounts.get("0")));
        System.out.println(min);
    }

    private static Map<Integer, Integer> countEvenDigits(List<Integer> inputList) {
        return inputList.stream().filter(i -> i % 2 == 0).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }

    private static Map<Integer, Integer> countOddDigits(List<Integer> inputList) {
        return inputList.stream().filter(i -> i % 2 == 1).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }

    private static int calculateSum(int evenCount, int oddCount) {
        return evenCount + oddCount;
    }
}
```
Note that this code assumes that the input string is a sequence of digits, and it uses the `Scanner` class to read the input from the console. It also uses the `Arrays` and `Collections` classes to convert the input string to a list of integers and to count the even and odd digits in the list. Finally, it uses the `Math` class to calculate the minimum of the two expressions.
