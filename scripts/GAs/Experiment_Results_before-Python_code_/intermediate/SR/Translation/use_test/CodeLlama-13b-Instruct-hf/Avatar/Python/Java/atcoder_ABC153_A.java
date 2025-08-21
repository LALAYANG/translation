```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            sho++;
        }
        System.out.println(sho);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `map()` method is used to convert the two parts of the input string into integers.
* The `h / a` expression is used to calculate the number of hours that can be divided by the number of apples.
* The `h % a` expression is used to calculate the number of hours that cannot be divided by the number of apples.
* The `if` statement is used to check if the number of hours that cannot be divided by the number of apples is not equal to 0. If it is not equal to 0, then the number of shoes is incremented by 1.
* The `System.out.println()` method is used to print the number of shoes.

Note: The `map()` method is not available in Java, so you will need to use a different method to convert the input string into integers.
