```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                n = i;
                System.out.print(i + " ");
            }
        }
    }
}
```

Explanation:

1. The first line imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
2. The `main` method is the entry point of the program, and it is where the program's execution begins.
3. The `Scanner` object is created and used to read an integer input from the user.
4. The `for` loop is used to iterate from `n` to 0, and the `if` statement is used to check if `n` is divisible by `i`. If it is, then `n` is set to `i` and the value of `i` is printed.
5. The `System.out.print` method is used to print the value of `i` followed by a space.
6. The `}` at the end of the `for` loop indicates the end of the loop.
7. The `}` at the end of the `main` method indicates the end of the method.

Test case:

Input:
12

Output:
12 6 3 1

Explanation:

1. The user inputs the value 12.
2. The `for` loop iterates from 12 to 0, and the `if` statement checks if 12 is divisible by 12, which is true.
3. The value of `n` is set to 12, and the value of 12 is printed.
4. The `for` loop iterates again, and the `if` statement checks if 12 is divisible by 6, which is true.
5. The value of `n` is set to 6, and the value of 6 is printed.
6. The `for` loop iterates again, and the `if` statement checks if 6 is divisible by 3, which is true.
7. The value of `n` is set to 3, and the value of 3 is printed.
8. The `for` loop iterates again, and the `if` statement checks if 3 is divisible by 1, which is true.
9. The value of `n` is set to 1, and the value of 1 is printed.
10. The `for` loop terminates, and the program ends.
