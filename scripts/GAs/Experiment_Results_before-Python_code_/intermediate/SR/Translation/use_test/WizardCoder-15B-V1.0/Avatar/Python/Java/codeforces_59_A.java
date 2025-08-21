```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int cu = 0, cl = 0;
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (Character.isLowerCase(ch)) {
                cl++;
            } else {
                cu++;
            }
        }
        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}
```
