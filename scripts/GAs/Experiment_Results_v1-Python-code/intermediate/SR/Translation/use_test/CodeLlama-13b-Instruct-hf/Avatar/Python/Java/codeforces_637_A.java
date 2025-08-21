
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }
        List<String> reversedS = Arrays.asList(s);
        Collections.reverse(reversedS);
        int c = -1;
        String a = "";
        for (int i = 0; i < reversedS.size(); i++) {
            String word = reversedS.get(i);
            if (w.get(word) == Collections.max(w.values())) {
                if (i > c) {
                    a = word;
                    c = i;
                }
            }
        }
        System.out.println(a);
    }
}
```
Note that this code assumes that the input is a single line of text, with each word separated by a space. It also assumes that the input is in the correct format, with the number of words on the first line, followed by the words on the second line.

Also, this code uses the `HashMap` class to store the word counts, which is more efficient than using a `List` and iterating over it to find the maximum value.

Finally, this code uses the `Collections.reverse` method to reverse the order of the words in the input, which is more efficient than using a `for` loop to iterate over the words in reverse order.
