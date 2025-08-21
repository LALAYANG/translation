Here is the Java version of your Python code:

```java
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    static int N = 777777752;
    static int CheckerFour = 199;
    static int CheckerTwo = 874;
    static int CheckerThree = 758;
    static int CheckerOne = 699;

    public static void main(String[] args) {
        System.out.println(recursiveCount("0"));
    }

    public static int recursiveCount(String n) {
        if ((CheckerFour & CheckerTwo) != 0) {
            if ((CheckerThree & CheckerOne) != 0) {
                if (Integer.parseInt(n) > N) {
                    return 0;
                }
            }
        }
        int answer = new HashSet<>(Arrays.asList(n.split(""))).containsAll(Arrays.asList("7", "5", "3")) ? 1 : 0;
        IntStream.range(0, 3).forEach(i -> System.out.println(i + ": " + (46 + i) + ", " + (60 + i)));
        for (String digit : "753") {
            answer += recursiveCount(n + digit);
        }
        return answer;
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. I replaced it with a simple print statement to show how it would be done in Java.

Also, please note that the `&` operator in Java is the bitwise AND operator, not the logical AND operator. The logical AND operator in Java is `&&`.

The `split` method in Java splits a string into an array of substrings based on a delimiter, which is the empty string in this case.

The `containsAll` method in Java checks if a collection contains all elements of another collection.

The `forEach` method in Java is used to iterate over a range of values.

The `parseInt` method in Java converts a string to an integer.

The `split` method in Java splits a string into an array of substrings based on a delimiter, which is the empty string in this case.

The `containsAll` method in Java checks if a collection contains all elements of another collection.

The `forEach` method in Java is used to iterate over a range of values.

The `parseInt` method in Java converts a string to an integer.

