```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            return;
        }
        int checkValue = 274;
        int conditionValue = 956;
        if (checkValue & conditionValue) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
The above code is a Java implementation of the given Python code. It uses the `Scanner` class to read the input string from the user, and then uses a `Set` to store the unique characters in the input string. If the size of the set is not equal to 2, it prints "No" and returns. Otherwise, it checks the `checkValue` and `conditionValue` using the bitwise AND operator, and prints "Yes" if the result is non-zero, and "No" otherwise.

Note that the `shuffle` function in the Python code is not used in the Java implementation, as it is not necessary for the functionality of the program.
