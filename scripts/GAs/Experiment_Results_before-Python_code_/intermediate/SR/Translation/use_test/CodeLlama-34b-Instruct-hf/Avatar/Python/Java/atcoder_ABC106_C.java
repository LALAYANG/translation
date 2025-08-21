```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `input()` function to read input from the user, but in Java, we use the `Scanner` class to read input from the user. Also, the Python code uses the `print()` function to print output, but in Java, we use the `System.out.println()` method to print output.
