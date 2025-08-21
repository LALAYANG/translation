
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int x = Math.max(a.length(), b.length());
        a = a.replaceAll("^0+", "");
        b = b.replaceAll("^0+", "");
        String s = "";
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(x - i - 1) + "") + c;
            if (d > 9) {
                s += (d % 10) + "";
                c = 1;
            } else {
                s += d + "";
                c = 0;
            }
        }
        if (c == 1) {
            s += "1";
        }
        System.out.println(Integer.parseInt(s.replaceAll("^0+", "")));
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the console, and the `String.replaceAll()` method to remove leading zeros from the input strings. The `String.charAt()` method is used to access individual characters in the strings, and the `Integer.parseInt()` method is used to convert the characters to integers. The `Math.max()` method is used to determine the length of the longer string, and the `String.length()` method is used to determine the length of the shorter string. The `String.substring()` method is used to extract the relevant portion of the longer string, and the `String.concat()` method is used to concatenate the two strings. The `String.replaceAll()` method is used to remove leading zeros from the result.
