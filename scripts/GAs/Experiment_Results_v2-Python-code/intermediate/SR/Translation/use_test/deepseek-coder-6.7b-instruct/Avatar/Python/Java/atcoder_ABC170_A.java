Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");
        int[] intArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            intArray[i] = Integer.parseInt(inputArray[i]);
        }
        int BitmaskThird = 853;
        int ConditionalValueThird = 517;
        int BitmaskFourth = 4;
        int ConditionalValueSecond = 317;
        int BitmaskFirst = 161;
        int BitmaskSecond = 225;
        for (int i = 0; i < intArray.length; i++) {
            if ((BitmaskFirst & BitmaskSecond) != 0) {
                if ((BitmaskFourth & ConditionalValueSecond) != 0) {
                    if ((BitmaskThird & ConditionalValueThird) != 0) {
                        if (intArray[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an array of integers from the standard input, and then checks each element of the array against a series of conditions. If the conditions are met and the element is 0, it prints the index of the element (1-indexed) and stops.

Please note that the ttest_ind function from scipy is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

