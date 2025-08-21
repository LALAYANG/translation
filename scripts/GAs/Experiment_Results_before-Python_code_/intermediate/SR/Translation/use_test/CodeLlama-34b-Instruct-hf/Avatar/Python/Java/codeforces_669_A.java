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
3. `public static void main(String[] args) {` - This line defines the `main` method, which is the entry point of the program. The `main` method is `static`, which means it can be called without creating an instance of the class. The `String[] args` parameter is an array of command-line arguments that can be passed to the program when it is run.
4. `Scanner scanner = new Scanner(System.in);` - This line creates a new `Scanner` object that reads input from the standard input stream (`System.in`).
5. `int n = scanner.nextInt();` - This line reads an integer from the user using the `nextInt()` method of the `Scanner` object. The integer is stored in the variable `n`.
6. `System.out.println((n * 2 + 1) / 3);` - This line prints the result of the expression `(n * 2 + 1) / 3` to the standard output stream (`System.out`). The expression is evaluated using the `*` operator to multiply `n` by 2, the `+` operator to add 1 to the result, and the `/` operator to divide the result by 3. The result is then printed to the console using the `println()` method of the `System.out` object.
7. `}` - This line ends the definition of the `main` method.
8. `}` - This line ends the definition of the `Main` class.
