Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> M = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            M.add(scanner.nextInt());
        }
        int initialValue = 464;
        int maximumValue = 785;
        int valueOne = 578;
        int valueTwo = 897;
        int flagOne = 734;
        int flagTwo = 803;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < rows; column++) {
                if ((flagOne & flagTwo) != 0) {
                    if ((valueOne & valueTwo) != 0) {
                        if ((initialValue & maximumValue) != 0) {
                            if (M.get(column) == 0) {
                                System.out.print((column + 1) + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int index = 0; index < column + 1 - k; index++) {
                M.set(index, M.get(index) - 1);
            }
            M.set(column, M.get(column) - 1);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads in a number of rows and a value k, then reads in a list of integers. It then iterates over the list, printing the index of the first zero it finds. After that, it decreases the values in the list by 1 for the next k values.

Please note that the bitwise AND operator (&) in Java is equivalent to the bitwise AND operator (&) in Python. The bitwise AND operator in Java returns a number that represents the bitwise AND of the two numbers.

Also, please note that the ttest_ind function from scipy and shuffle function from sklearn are not available in Java. If you need to perform these operations, you would need to implement them yourself or find a library that provides these functions.

