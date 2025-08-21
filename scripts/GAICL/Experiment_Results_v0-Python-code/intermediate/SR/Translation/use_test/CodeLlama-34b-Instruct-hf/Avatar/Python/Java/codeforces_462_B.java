```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }

        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                break;
            }
            res += count[i] * count[i];
        }

        System.out.println(res);
    }
}
```
The above code is a Java implementation of the given Python code. It uses a `Scanner` to read the input from the user and then calculates the result using the given formula.

The `count` array is used to store the frequency of each letter in the input string `s`. The `res` variable is used to store the result of the calculation.

The code then iterates over the `count` array and checks if the frequency of any letter is greater than or equal to `k`. If it is, the code adds `k * k` to the result and breaks out of the loop. Otherwise, it adds the square of the frequency to the result.

Finally, the code prints the result to the console.
