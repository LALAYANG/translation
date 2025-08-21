Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = {57, 99, 63};
        int[] secondArray = {30, 6, 15};
        int[] thirdArray = {8, 87, 63};
        int[] fourthArray = {577, 673, 106, 330};
        List<Integer> decisionOptions = Arrays.asList(10, 100, 1000, 10000, 100000);

        // The Python code for ttest_ind is not directly translatable to Java as it's a statistical test from scipy library.
        // In Java, we can use libraries like Apache Commons Math or JScience for statistical calculations.

        // Shuffling the array
        Collections.shuffle(Arrays.asList(thirdArray));

        // Getting user decision
        String userDecision = scanner.next();
        int sum = 0;
        for (char c : userDecision.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        if (fourthArray[0] != 0 && fourthArray[1] != 0 && fourthArray[2] != 0 && fourthArray[3] != 0) {
            if (fourthArray[2] != 0 && fourthArray[3] != 0) {
                if (decisionOptions.contains(Integer.parseInt(userDecision))) {
                    System.out.println(10);
                } else {
                    System.out.println(sum);
                }
            }
        }
    }
}
```

Please note that the t-test is a statistical test that is not directly translatable to Java. In Java, you can use libraries like Apache Commons Math or JScience for statistical calculations.

Also, the Python code for shuffling an array is not directly translatable to Java. In Java, you can use the `Collections.shuffle()` method to shuffle an array or a list.

The Python code for checking if a number is not zero is written as `if ThirdChecker & FourthChecker:` and `if SecondChecker & FirstChecker:`. In Java, you can use the `!=` operator to check if a number is not zero.

The Python code for checking if a value exists in a list is written as `if UserDecision in DecisionOptions:`. In Java, you can use the `contains()` method of a list to check if a value exists in a list.

The Python code for summing the digits of a number is written as `new = np.sum(np.array([list(map(int, UserDecision))]))`. In Java, you can use a for-each loop to iterate over the characters of a string and add their numeric values to a sum.

