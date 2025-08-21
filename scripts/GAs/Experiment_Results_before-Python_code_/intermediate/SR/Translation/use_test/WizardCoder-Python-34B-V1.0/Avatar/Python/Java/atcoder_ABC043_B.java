```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String my_str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                my_str += c;
            } else if (c == 'B' && !my_str.isEmpty()) {
                my_str = my_str.substring(0, my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}
```

Test input:
0BB1BB0BB1

Expected output:
1 
