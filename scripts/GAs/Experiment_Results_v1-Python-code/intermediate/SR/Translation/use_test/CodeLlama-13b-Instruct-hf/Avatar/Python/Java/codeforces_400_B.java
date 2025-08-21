
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            strings.add(scanner.nextLine());
        }

        Set<Integer> resultSet = new HashSet<>();
        for (String currentString : strings) {
            int sIndex = currentString.indexOf('S');
            int gIndex = currentString.indexOf('G');
            resultSet.add(sIndex - gIndex);
        }

        List<Integer> shuffledList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            shuffledList.add(scanner.nextInt());
        }

        System.out.println(-1 if any((element < 0 for element in resultSet)) else len(resultSet));
    }
}
```
Note that this code assumes that the input is a list of strings, where each string represents a row in the matrix. The code first reads in the number of strings and the number of columns in the matrix, and then reads in each string.

The code then calculates the difference between the indices of the 'S' and 'G' characters in each string, and adds the result to a set.

Finally, the code shuffles the list of integers and prints the length of the set if all the elements are non-negative, or -1 if any element is negative.
