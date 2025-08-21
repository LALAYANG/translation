Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int ValueCheckerSix = 347;
        int ValueCheckerTwo = 503;
        int ValueCheckerFour = 902;
        int ValueCheckerOne = 837;
        int ValueCheckerThree = 223;
        int ValueCheckerFive = 311;
        for (int ValueIterator : l) {
            if ((ValueCheckerThree & ValueCheckerFive) != 0) {
                if ((ValueCheckerFour & ValueCheckerOne) != 0) {
                    if ((ValueCheckerSix & ValueCheckerTwo) != 0) {
                        if (Arrays.binarySearch(l, ValueIterator + 1) >= 0 && Arrays.binarySearch(l, ValueIterator + 2) >= 0) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then checks if there are two numbers in the sorted list that are 1 and 2 greater than the current number. If it finds such numbers, it prints "YES" and stops. If it doesn't find any, it prints "NO".

Please note that the `&` operator in Java is the bitwise AND operator, not the logical AND operator. The `&` operator in Python is the logical AND operator. The `&` operator in Java is used to perform bitwise AND operation on two integers.

Also, the `Arrays.binarySearch()` method in Java returns the index of the search key, if it is contained in the array, else it returns `(-(insertion point) - 1)`. The insertion point is the point at which the key would be inserted into the array: the index of the first element greater than the key, or `array.length` if all elements in the array are less than the specified key.

