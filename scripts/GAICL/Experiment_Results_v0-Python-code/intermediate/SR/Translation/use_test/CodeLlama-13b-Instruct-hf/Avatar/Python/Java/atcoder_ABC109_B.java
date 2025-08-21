
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.next());
        }
        scanner.close();

        Map<String, Integer> charCounts = new HashMap<>();
        for (String v : charList) {
            charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
        }

        String f = "Yes";
        for (int i = 0; i < charList.size(); i++) {
            if (charCounts.get(charList.get(i)) >= 2) {
                f = "No";
                break;
            }
        }

        System.out.println(f);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the list of characters. The `HashMap` class is used to store the counts of each character. The `for` loop iterates over the characters in the list and increments the count for each character. The `if` statement checks if the count for a character is greater than or equal to 2, and if so, sets the `f` variable to "No". Finally, the `System.out.println` method is used to print the value of the `f` variable.

Note that the `getOrDefault` method is used to get the count for a character, and if the character is not in the map, it returns 0. This is equivalent to the `defaultdict` function in Python.
