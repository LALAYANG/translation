```java
import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (w.containsKey(num)) {
                w.put(num, w.get(num) + 1);
            } else {
                w.put(num, 1);
            }
        }
        int c = 0;
        for (int i : w.keySet()) {
            if (i == 0) {
                c += w.get(i) * (w.get(i) - 1);
            } else {
                if (w.containsKey(-i)) {
                    c += w.get(i) * w.get(-i);
                }
            }
        }
        System.out.println(c / 2);
    }
}
```
Explanation:

The code is written in Java and it is similar to the Python code. It uses a HashMap to store the count of each number. The HashMap is initialized with the input numbers and then it is iterated to calculate the count of pairs. The count is calculated by checking if the number and its negative are present in the HashMap and if they are, then the count is incremented by the product of their counts. Finally, the count is divided by 2 and printed.

Test case:

Input:
2
10 -10

Output:
1

Explanation:

The input is 2 numbers, 10 and -10. The count of pairs is calculated as follows:

* The count of pairs with 10 is 1 (10 and -10)
* The count of pairs with -10 is 1 (10 and -10)

Therefore, the total count of pairs is 2.

Note: The code is written in Java and it is similar to the Python code. It uses a HashMap to store the count of each number. The HashMap is initialized with the input numbers and then it is iterated to calculate the count of pairs. The count is calculated by checking if the number and its negative are present in the HashMap and if they are, then the count is incremented by the product of their counts. Finally, the count is divided by 2 and printed.
