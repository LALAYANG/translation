<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
12

Expected output:
12 6 3 1


```
n = int ( input ( ) )
for i in range ( n , 0 , - 1 ) :
    if n % i == 0 : n = i ; print ( i , end = ' ' )


```
[/INST]
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
4. The `for` loop is used to iterate from the input number `n` to 0, and for each iteration, the modulo operator `%` is used to check if the input number is divisible by the current iteration number `i`.
5. If the input number is divisible by the current iteration number, the `n` variable is updated to the current iteration number, and the current iteration number is printed to the console.
6. The `end` parameter of the `print` method is used to add a space character after each printed number.
7. The `main` method ends with the `}` character.

Test case:

Input:
12

Output:
12 6 3 1

Explanation:

1. The input number is 12.
2. The `for` loop iterates from 12 to 0, and for each iteration, the modulo operator `%` is used to check if the input number is divisible by the current iteration number.
3. The input number is divisible by 12, so the `n` variable is updated to 12, and 12 is printed to the console.
4. The input number is also divisible by 6, so the `n` variable is updated to 6, and 6 is printed to the console.
5. The input number is also divisible by 3, so the `n` variable is updated to 3, and 3 is printed to the console.
6. The input number is also divisible by 1, so the `n` variable is updated to 1, and 1 is printed to the console.
7. The `for` loop ends, and the `main` method ends with the `}` character.</s>
