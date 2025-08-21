```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (n % 2 != 0) {
            System.out.println("No");
        } else if (s.substring(0, n / 2).equals(s.substring(n / 2, n))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `substring` method is used to extract the first half of the string and compare it to the second half. If the two halves are equal, the program prints "Yes", otherwise it prints "No".
