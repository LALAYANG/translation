```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                int n = Integer.parseInt(String.valueOf(ip.charAt(i)));
                if (n > 4) {
                    n = 9 - n;
                    st += String.valueOf(n);
                } else {
                    st += String.valueOf(n);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a string from the standard input, checks each character in the string, and if the character is greater than 4, it subtracts the character from 9 and appends the result to a new string. If the character is not greater than 4, it appends the character to the new string as is. The new string is then printed to the standard output.

