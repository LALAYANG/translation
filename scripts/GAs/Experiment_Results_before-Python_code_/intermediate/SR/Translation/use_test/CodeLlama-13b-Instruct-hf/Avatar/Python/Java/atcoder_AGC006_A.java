```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        if (s.equals(t)) {
            System.out.println(n);
        } else {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    if (j == n - i - 1) {
                        cnt = n - i;
                    }
                }
            }
            System.out.println(2 * n - cnt);
        }
    }
}
```
This is a Java implementation of the given Python code. It uses the `Scanner` class to read input from the user, and the `String` class to represent the two strings. The logic for finding the longest common subsequence is the same as in the Python code, with the only difference being that in Java, we use the `charAt()` method to access the characters of a string.
