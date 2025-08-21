
The provided Python code is a bit complex and involves several concepts such as decorators, threads, and queues. However, I can provide a basic Java implementation of the `append_digits` function that is similar to the Python code.

Here is the Java implementation:
```java
import java.util.ArrayList;
import java.util.List;

public class AppendDigits {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i <= 371; i++) {
            int count = 0;
            int p = i;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                int q = i;
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                List<Integer> digits = temp.subList(temp.size() - 1, temp.size());
                li = appendDigits(li, digits);
            } else if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                int q = i;
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li = li.addAll(temp.subList(temp.size() - 1, temp.size()));
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int n = Integer.parseInt(args[0]);
        System.out.println(li.get(n - 1));
    }

    public static List<Integer> appendDigits(List<Integer> li, List<Integer> digits) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            int x = li.get(i);
            for (int j = 0; j < digits.size(); j++) {
                int y = digits.get(j);
                result.add(x * 10 + y);
            }
        }
        return result;
    }
}
```
This implementation uses the same logic as the Python code, but it is written in Java. The `appendDigits` function takes two lists of integers as input and returns a list of integers that is the result of appending the digits of the second list to the end of each integer in the first list. The `main` function uses this function to generate the list of integers and then prints the `n`th element of the list.

Note that this implementation is not optimized for performance and may not be the most efficient way to solve the problem. However, it should produce the correct output for the given input.
