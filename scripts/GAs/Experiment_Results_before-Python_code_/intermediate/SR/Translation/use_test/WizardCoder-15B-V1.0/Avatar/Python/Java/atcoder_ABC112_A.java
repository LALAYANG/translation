```java
import java.util.Scanner;

public class Main {
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

Explanation:

- We first import the `Scanner` class from the `java.util` package to read input from the user.
- We create a `Scanner` object `sc` to read input from the user.
- We read the input integer `age` from the user using the `nextInt()` method of the `Scanner` class.
- We use an `if-else` statement to check if the `age` is equal to 1. If it is, we print "Hello World" using the `println()` method of the `System.out` object. Otherwise, we read two integers `a` and `b` from the user using the `nextInt()` method of the `Scanner` class and store them in variables `a` and `b`. We then print the sum of `a` and `b` using the `println()` method of the `System.out` object.
