```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.nextLine();

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }

        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                return;
            }
            k -= count[i];
            res += count[i] * count[i];
        }

        System.out.println(res);
    }
}
```
This is a solution to the problem in Java. It first reads the input from the user, which is the length of the string `n` and the number of distinct characters `k`. It then reads the string `s` and initializes an array `count` of size 26 to store the frequency of each character in the string.

The program then iterates over the characters in the string and increments the corresponding index in the `count` array.

Next, the program initializes a variable `res` to 0 and iterates over the `count` array. For each index `i`, if the frequency of the character at that index is greater than or equal to `k`, the program adds `k * k` to `res` and exits the loop. If the frequency of the character at that index is less than `k`, the program subtracts the frequency of the character from `k` and adds the square of the frequency to `res`.

Finally, the program prints the value of `res` to the console.
