Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                char c = ip.charAt(i);
                if (c - '0' > 4) {
                    int n = 9 - (c - '0');
                    st += n;
                } else {
                    st += c;
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

This Java code does the same thing as the Python code. It reads a string of digits from the input, and for each digit, if it is greater than 4, it subtracts 5 from it (to get a number less than or equal to 4), and adds this to the output string. If the first digit is 9, it removes it from the input and adds it to the output string. The result is then printed as an integer.

