
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.next());
        }
        Collections.shuffle(l);
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : l) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        String f = "Yes";
        for (int i = 0; i < l.size(); i++) {
            if (wordCounts.get(l.get(i)) >= 2) {
                f = "No";
                break;
            }
        }
        System.out.println(f);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the list of words. The `Collections.shuffle()` method is used to shuffle the list, and the `HashMap` class is used to store the word counts. The `getOrDefault()` method is used to get the value of a key in the map, or a default value if the key is not present. The `for` loop is used to iterate over the list of words and update the word counts. Finally, the `System.out.println()` method is used to print the result.
