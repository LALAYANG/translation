```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] cookies = new long[3];
        for (int i = 0; i < 3; i++) {
            cookies[i] = scanner.nextLong();
        }
        long leftOver = cookies[0] - cookies[2];
        long takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (takahashi > 0 ? cookies[1] : Math.max(0, cookies[1] - Math.abs(leftOver))));
    }
}
```

This Java code does the same thing as the Python code you provided. It reads three long integers from the standard input, calculates the leftover cookies after Takahashi ate all of them, and then calculates how many cookies Takahashi and Aoki can eat. If Takahashi ate all the cookies, Aoki can eat all the cookies. Otherwise, Aoki can eat the remaining cookies. The result is printed to the standard output.

