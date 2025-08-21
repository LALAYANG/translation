```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(scanner.nextInt());
        }
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!l.containsKey(lst.get(i))) {
                l.put(lst.get(i), 1);
            } else {
                l.put(lst.get(i), l.get(lst.get(i)) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst.get(i)) > 1) {
                res += n - i - l.get(lst.get(i));
                l.put(lst.get(i), l.get(lst.get(i)) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```
Explanation:

The code is written in Java and it is similar to the Python code you provided. It uses a `Scanner` to read the input from the user and a `List` to store the input values. It also uses a `Map` to keep track of the frequency of each element in the input list.

The code first reads the input values and stores them in a `List`. It then iterates over the list and updates the frequency of each element in the `Map`.

After that, it iterates over the list again and calculates the result based on the frequency of each element. If the frequency of an element is greater than 1, it adds the difference between the current index and the last index of the element to the result. If the frequency is 1, it adds the difference between the current index and the last index of the element minus 1 to the result.

Finally, it prints the result.

Note that the code assumes that the input values are non-negative integers. If the input values can be negative, you may need to modify the code accordingly.
