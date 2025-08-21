```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        char[] s = parts[0].toCharArray();
        char[] p = parts[1].toCharArray();
        int i = Integer.parseInt(String.valueOf(p[0]));
        if (s[s.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (s[s.length - 1] != '9' && i < 5) {
            System.out.println(new String(s));
        } else {
            String sStr = new String(s);
            int sInt = Integer.parseInt(sStr) + 1;
            System.out.println(sInt);
        }
    }
}
```

Test input:
9.1

Expected output:
GOTO Vasilisa. 
