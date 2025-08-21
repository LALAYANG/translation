```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() == 1) {
            System.out.println(0);
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        int[] arr = new int[map.size()];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            arr[i++] = entry.getValue();
        }
        Arrays.sort(arr);
        int ans = arr[0] * 2;
        System.out.println(ans);
    }
}
```
This solution uses a `HashMap` to count the frequency of each character in the input string. It then converts the `HashMap` to an array of integers, sorts the array, and finds the minimum value in the array. The minimum value is then multiplied by 2 to get the final answer.

Note that this solution assumes that the input string is non-empty and contains at least two different characters. If the input string is empty or contains only one character, the solution will output 0.
