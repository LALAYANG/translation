<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6

Expected output:
4


```
n = int ( input ( ) )
print ( ( n * 2 + 1 ) // 3 )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n * 2 + 1) / 3);
    }
}
```

Explanation:

1. `import java.util.Scanner;` - This line imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
2. `public class Main {` - This line begins the definition of a new class called `Main`.
3. `public static void main(String[] args) {` - This line defines the `main` method, which is the entry point of the program. The `main` method is declared as `static`, which means it can be called without creating an instance of the class. The `String[] args` parameter is used to pass command-line arguments to the program.
4. `Scanner scanner = new Scanner(System.in);` - This line creates a new `Scanner` object that reads input from the standard input stream (usually the keyboard).
5. `int n = scanner.nextInt();` - This line reads an integer from the user using the `nextInt()` method of the `Scanner` object. The integer is stored in the variable `n`.
6. `System.out.println((n * 2 + 1) / 3);` - This line prints the result of the expression `(n * 2 + 1) / 3` to the standard output stream (usually the console). The expression is evaluated using the `*` operator for multiplication, the `+` operator for addition, and the `/` operator for division. The result is then printed using the `println()` method of the `System.out` object.
7. `}` - This line ends the definition of the `main` method.
8. `}` - This line ends the definition of the `Main` class.

Sample input and output:

Input:
6

Output:
4</s>
