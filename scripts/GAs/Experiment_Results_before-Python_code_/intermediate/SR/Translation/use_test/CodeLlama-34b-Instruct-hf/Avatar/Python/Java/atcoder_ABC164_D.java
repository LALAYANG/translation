```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int l = 2019;
        int[] m = new int[l + 1];
        int a = 0;
        int r = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            a += Integer.parseInt(String.valueOf(input.charAt(i))) * Math.pow(10, i, l);
            r += m[a % l];
            m[a % l] += 1;
        }
        System.out.println(r);
    }
}
```
Note: The `pow` method in Java is used to calculate the power of a number, and the `parseInt` method is used to convert a string to an integer.
