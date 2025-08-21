```
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(sc.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int i : numSet) {
            for (int j = 1; j <= 30; j++) {
                i = i / 2;
                if (i % 2 != 0) {
                    twoTimesSet.add(j);
                    break;
                }
            }
        }
        if (twoTimesSet.size() != 1) {
            System.out.println(0);
        } else {
            List<Integer> numList = new ArrayList<>(numSet);
            int lcm = numList.get(0);
            for (int i = 1; i < numList.size(); i++) {
                lcm = lcm * numList.get(i) / gcd(lcm, numList.get(i));
            }
            System.out.println((num - lcm / 2) / lcm + 1);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
The above code is a Java implementation of the Python code you provided. It uses the same logic and algorithms as the Python code, but with some minor changes to make it compatible with Java.

Here's a brief explanation of the code:

1. The `main` method takes in the input from the user and stores it in the `n` and `num` variables.
2. It then creates a `Set` to store the numbers in the input, and a `List` to store the numbers in the input.
3. It then iterates over the `Set` and for each number, it checks if it is divisible by 2, and if it is, it adds the number to the `twoTimesSet`.
4. If the `twoTimesSet` has a size of 1, it means that all the numbers in the input are divisible by 2, and it calculates the LCM of the numbers in the input using the `gcd` method.
5. It then prints the result of the calculation.

Note that the `gcd` method is a helper method that calculates the greatest common divisor of two numbers. It is used in the calculation of the LCM.
