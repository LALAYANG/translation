<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
dbyfw,rpwbpuv,ifnua

Expected output:
dbyfw rpwbpuv ifnua


```
print ( input ( ).replace ( "," , " " ) )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(",", " "));
    }
}
```

Explanation:

1. `import java.util.Scanner;` - imports the Scanner class from the java.util package.
2. `public class Main {` - begins the definition of a new class called Main.
3. `public static void main(String[] args) {` - defines the main method, which is the entry point of the program.
4. `Scanner scanner = new Scanner(System.in);` - creates a new Scanner object that reads input from the standard input stream (System.in).
5. `String input = scanner.nextLine();` - reads a line of text from the standard input stream and stores it in a String variable called input.
6. `System.out.println(input.replace(",", " "));` - prints the input string to the standard output stream, replacing any commas (",") with spaces (" ").
7. `}` - ends the definition of the main method.
8. `}` - ends the definition of the Main class.</s>
