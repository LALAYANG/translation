```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            char[] chars = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if (chars[j] == '.') {
                    if ((i + j) % 2 == 1) chars[j] = 'W';
                    else chars[j] = 'B';
                }
            }
            l[i] = new String(chars);
        }
        for (String c : l) System.out.println(c);
    }
}
```

