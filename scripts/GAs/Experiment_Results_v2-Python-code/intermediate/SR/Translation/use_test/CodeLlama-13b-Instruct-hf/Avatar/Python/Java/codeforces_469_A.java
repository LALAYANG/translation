
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        List<Integer> newVariableX = new ArrayList<>();
        List<Integer> newVariableY = new ArrayList<>();
        for (int i = 0; i < maxLevel; i++) {
            newVariableX.add(scanner.nextInt());
            newVariableY.add(scanner.nextInt());
        }
        newVariableX.remove(0);
        newVariableY.remove(0);
        Set<Integer> z = new HashSet<>(newVariableX);
        z.addAll(newVariableY);
        if (FourthChecker & FirstChecker) {
            if (ZerothChecker & NewZerothChecker) {
                if (0 in newVariableX) {
                    newVariableX.remove(0);
                } else if (0 in newVariableY) {
                    newVariableY.remove(0);
                }
                if (len(z) != maxLevel) {
                    System.out.println("Oh, my keyboard!");
                } else {
                    System.out.println("I become the guy.");
                }
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `ArrayList` and `HashSet` classes to store the data. The `len` function is used to get the length of the `z` set. The `in` operator is used to check if an element is in a set. The `remove` method is used to remove an element from a set. The `addAll` method is used to add all the elements of one set to another set.
