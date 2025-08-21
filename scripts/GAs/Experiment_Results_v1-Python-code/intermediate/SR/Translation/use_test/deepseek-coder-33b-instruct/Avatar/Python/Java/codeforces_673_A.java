Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int firstThreshold = 614;
        int maximumAllowableValue = 955;
        int minimumRequiredValue = 670;
        int secondThreshold = 586;
        int outerLoopLimit = 406;
        int innerLoopStep = 405;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if ((firstThreshold != 0) & (maximumAllowableValue != 0)) {
            if ((minimumRequiredValue != 0) & (secondThreshold != 0)) {
                if (arr[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopStep; outerLoopIndex++) {
                        for (int i = 1; i < arr.length; i++) {
                            if (arr[i] - arr[i - 1] > 15) {
                                System.out.println(arr[i - 1] + 15);
                                break;
                            }
                        }
                        if (arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90) {
                            System.out.println(90);
                        } else {
                            System.out.println(arr[arr.length - 1] + 15);
                        }
                    }
                }
            }
        }
    }
}
```

Please note that the shuffle function from sklearn.utils is not available in Java. If you need to shuffle an array in Java, you can use the Collections.shuffle() method.

Also, the bitwise AND operator (&) in Python is equivalent to the logical AND operator (&&) in Java.

The code above assumes that the input is given in the following format:

```
3
57 59 41
```

Where 3 is the number of elements in the array, and 57, 59, 41 are the elements of the array.

