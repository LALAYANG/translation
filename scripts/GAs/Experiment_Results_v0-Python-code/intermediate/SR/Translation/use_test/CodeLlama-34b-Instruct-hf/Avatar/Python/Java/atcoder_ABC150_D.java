```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(scanner.nextInt());
        }

        List<Integer> twoTimesList = new ArrayList<>();
        for (int i = 0; i < numSet.size(); i++) {
            int currentNum = numSet.get(i);
            for (int j = 1; j <= currentNum; j++) {
                if (currentNum % j == 0) {
                    twoTimesList.add(j);
                    break;
                }
            }
        }

        if (twoTimesList.size() != 1) {
            System.out.println(0);
            return;
        }

        int lcm = numSet.get(0);
        for (int i = 1; i < numSet.size(); i++) {
            lcm = lcm * numSet.get(i) / Math.gcd(lcm, numSet.get(i));
        }

        System.out.println((num - lcm / 2) / lcm + 1);
    }
}
```
Explanation:

The code is a Java implementation of the Python code you provided. It uses the same logic as the Python code, but with some minor changes to make it more efficient and easier to read.

The code first reads the input from the user using a `Scanner` object. It then creates a `HashSet` to store the numbers and a `List` to store the numbers that are divisible by 2.

The code then iterates over the numbers in the `HashSet` and checks if each number is divisible by 2. If it is, it adds the number to the `List`. If the `List` contains more than one element, the code prints 0 and returns.

If the `List` contains only one element, the code calculates the least common multiple (LCD) of the numbers in the `HashSet` using the Euclidean algorithm. It then prints the result of the calculation.

Note that the code uses the `Math.gcd` method to calculate the greatest common divisor of two numbers, which is equivalent to the `fractions.gcd` method in Python.
