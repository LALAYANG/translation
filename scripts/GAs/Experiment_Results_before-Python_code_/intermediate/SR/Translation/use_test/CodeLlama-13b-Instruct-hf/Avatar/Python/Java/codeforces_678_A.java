```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vamshi = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((vamshi / z + 1) * z);
    }
}
```
Explanation:

* `import java.util.Scanner;` - This line imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
* `public class Solution {` - This line starts a new class called `Solution`.
* `public static void main(String[] args) {` - This line starts the `main` method, which is the entry point of the program. The `String[] args` parameter is used to pass command-line arguments to the program.
* `Scanner scanner = new Scanner(System.in);` - This line creates a new `Scanner` object that reads input from the standard input stream (i.e., the keyboard).
* `int vamshi = scanner.nextInt();` - This line reads the first integer from the input stream and assigns it to the `vamshi` variable.
* `int z = scanner.nextInt();` - This line reads the second integer from the input stream and assigns it to the `z` variable.
* `System.out.println((vamshi / z + 1) * z);` - This line prints the result of the expression `(vamshi / z + 1) * z` to the standard output stream (i.e., the console).
* `}` - This line ends the `main` method.
* `}` - This line ends the `Solution` class.
