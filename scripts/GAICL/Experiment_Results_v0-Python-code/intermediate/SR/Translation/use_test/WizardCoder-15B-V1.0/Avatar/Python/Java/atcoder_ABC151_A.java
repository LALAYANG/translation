```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String result = solve(c);
        System.out.println(result);
    }

    public static String solve(String c) {
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int i = 0;
        while (i < a.length && a[i] != c.charAt(0)) {
            i++;
        }
        if (i == a.length) {
            return "Invalid input";
        }
        return String.valueOf(a[i + 1]);
    }
}
```
