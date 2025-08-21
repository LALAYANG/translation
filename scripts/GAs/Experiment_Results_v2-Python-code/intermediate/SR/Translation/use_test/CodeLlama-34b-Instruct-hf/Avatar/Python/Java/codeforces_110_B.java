```
import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        String baseString = "abcd";
        String s = "";

        for (int i = 0; i < inputLength; i++) {
            s += baseString.charAt(i % 4);
        }

        System.out.println(s);
    }
}
```
Note: The Python code you provided is using the `sklearn` and `scipy` libraries, which are not available in Java. Therefore, I have removed those dependencies and used only the built-in Java libraries.
