
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Collections;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<String, Integer> even = getCount(s, 0);
        Map<String, Integer> odd = getCount(s, 1);
        System.out.println(Math.min(s.length() - (even.get("0") + odd.get("1")), s.length() - (even.get("1") + odd.get("0"))));
    }

    private static Map<String, Integer> getCount(String s, int index) {
        Map<String, Integer> count = new HashMap<>();
        for (int i = index; i < s.length(); i += 2) {
            String c = s.substring(i, i + 1);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        return count;
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses the `getCount` method to count the number of even and odd digits in the input string. The `getCount` method returns a `Map` that maps each digit to its count in the input string.

The `main` method then calculates the minimum number of digits that need to be changed to make the input string alternating, and prints the result to the console.

Note that this code assumes that the input string only contains the characters "0" and "1". If the input string contains other characters, the code will need to be modified to handle those characters as well.
