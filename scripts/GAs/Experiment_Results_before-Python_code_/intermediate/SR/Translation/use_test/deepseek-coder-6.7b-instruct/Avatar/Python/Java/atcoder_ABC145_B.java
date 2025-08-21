Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        if (n % 2 != 0) {
            System.out.println("No");
        } else if (s.substring(0, n / 2).equals(s.substring(n / 2))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer and a string from the input, checks if the length of the string is an even number, and then checks if the first half of the string is the same as the second half. If all these conditions are met, it prints "Yes", otherwise it prints "No".

