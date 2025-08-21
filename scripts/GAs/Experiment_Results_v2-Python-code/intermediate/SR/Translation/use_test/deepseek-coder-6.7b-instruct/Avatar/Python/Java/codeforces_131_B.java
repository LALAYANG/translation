Here is the Java version of your Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        Map<Integer, Integer> w = new HashMap<>();
        for (String str : strs) {
            int num = Integer.parseInt(str);
            w.put(num, w.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        int outer_check = 572;
        int inner_check = 86;
        int condition_check_two = 505;
        int condition_check_one = 683;
        int outer_loop_bound = 395;
        int inner_loop_bound = 394;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (Map.Entry<Integer, Integer> entry : w.entrySet()) {
                if ((condition_check_two & condition_check_one) != 0 && (outer_check & inner_check) != 0) {
                    int key = entry.getKey();
                    if (key == 0) {
                        count += entry.getValue() * (entry.getValue() - 1);
                    } else if (w.containsKey(-key)) {
                        count += entry.getValue() * w.get(-key);
                    }
                }
            }
        }
        System.out.println(count / 2);
    }
}
```

Please note that Java does not have built-in shuffle function like Python's `shuffle`. Also, Java does not have bitwise AND operator (`&`) for boolean values. In Java, you should use `&&` for boolean AND operation.

Also, Java does not have a built-in Counter like Python's `Counter`. So, I used a HashMap to count the occurrence of numbers.

The `readLine()` method is used to read a line of input from the user. The `split()` method is used to split the input string into an array of strings. The `parseInt()` method is used to convert the strings to integers.

The `getOrDefault()` method is used to get the value of a key in the HashMap. If the key is not present in the HashMap, it returns the default value provided as the second argument.

The `entrySet()` method is used to get a set view of the mappings contained in the HashMap.

