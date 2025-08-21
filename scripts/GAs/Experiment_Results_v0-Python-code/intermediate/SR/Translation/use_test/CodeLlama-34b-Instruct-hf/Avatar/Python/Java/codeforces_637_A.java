```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        String input = sc.nextLine();
        String[] s = input.split(" ");
        Map<String, Integer> counts = new HashMap<>();
        for (String element : s) {
            if (counts.containsKey(element)) {
                counts.put(element, counts.get(element) + 1);
            } else {
                counts.put(element, 1);
            }
        }
        List<String> maxElements = new ArrayList<>();
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElements.clear();
                maxElements.add(entry.getKey());
            } else if (entry.getValue() == maxCount) {
                maxElements.add(entry.getKey());
            }
        }
        System.out.println(maxElements.get(0));
    }
}
```
Explanation:

1. The first line of the code imports the necessary libraries.
2. The `main` method is the entry point of the program. It reads the input from the user and stores it in the `input` variable.
3. The `input` variable is then split into an array of strings using the `split` method.
4. A `HashMap` is created to store the counts of each element in the input array.
5. The `HashMap` is iterated over, and for each element, its count is checked. If the count is greater than the current maximum count, the element is added to the `maxElements` list.
6. Finally, the first element in the `maxElements` list is printed to the console.

Note: The code assumes that the input is a space-separated list of integers. If the input is in a different format, the code will need to be modified accordingly.
