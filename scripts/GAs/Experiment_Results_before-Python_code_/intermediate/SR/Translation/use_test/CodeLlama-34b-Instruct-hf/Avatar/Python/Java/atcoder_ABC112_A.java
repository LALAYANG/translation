```java
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age == 1) {
            System.out.println("Hello World");
        } else {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
```

Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read an integer input from the user. The `System.out.println()` method is used to print output to the console.
