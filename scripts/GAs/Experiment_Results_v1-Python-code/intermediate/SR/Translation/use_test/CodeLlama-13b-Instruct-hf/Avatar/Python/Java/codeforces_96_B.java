
Here is the Java code that translates the Python code:
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int limit = 1000000000;

        generateNumberSequence(0, 0, 0);
        l.sort(null);
        int targetNumber = Integer.parseInt(args[0]);
        int ans = 0;
        int outerLoopLimit = 690;
        int innerLoopLimit = 689;

        for (int i = 0; i < outerLoopLimit; i++) {
            for (int j = 0; j < innerLoopLimit; j++) {
                for (int val : l) {
                    if (val >= targetNumber) {
                        ans = val;
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }

    public static void generateNumberSequence(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumberSequence(number * 10 + 4, four + 1, seven);
        generateNumberSequence(number * 10 + 7, four, seven + 1);
    }
}
```
Note that the Java code uses the `ArrayList` class to store the list of numbers, and the `sort` method to sort the list. The `parseInt` method is used to convert the input string to an integer. The `for` loops are used to iterate over the list of numbers and find the first number that is greater than or equal to the target number.
