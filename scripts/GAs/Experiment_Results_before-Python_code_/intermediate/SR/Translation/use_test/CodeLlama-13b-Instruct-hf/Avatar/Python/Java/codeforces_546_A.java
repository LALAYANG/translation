```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= w; i++) {
            total += i * k;
        }
        if (total > n) {
            System.out.println(total - n);
        } else {
            System.out.println(0);
        }
    }
}
```

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `main` method is the entry point of the program.
* The `Scanner` object is created to read input from the user.
* The `nextInt` method is used to read the input as an integer.
* The `for` loop is used to calculate the total cost of the items.
* The `if` statement is used to check if the total cost is greater than the budget.
* The `System.out.println` method is used to print the output.

Note: The code is written in Java 8, so you may need to modify it to work with earlier versions of Java.
