```java
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String LUCKY = "abcd";
        String s = "";
        for (int i = 0; i < n; i++) {
            s += LUCKY.charAt(i % 4);
        }
        System.out.println(s);
    }
}
```

Note: In Java, the `charAt()` method is used to access a character in a string by its index. The `%` operator is used to compute the remainder of the division of `i` by 4, which is used to index the `LUCKY` string.
