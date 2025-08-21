```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowCount = sc.nextInt();
        int columnCount = sc.nextInt();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            String s = sc.next();
            s = s.toCharArray();
            for (int j = 0; j < columnCount; j++) {
                if (s[j] == '.') {
                    if ((i + j) % 2 == 0) {
                        s[j] = 'W';
                    } else {
                        s[j] = 'B';
                    }
                }
            }
            l.add(new String(s));
        }
        for (String c : l) {
            System.out.println(c);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `Scanner` to read input from the user and a `List` to store the resulting strings. The `for` loop iterates over the rows and columns, and the inner `if` statement checks if the current character is a dot. If it is, it sets the character to 'W' or 'B' based on the parity of the row and column indices. Finally, the resulting strings are added to the `List` and printed to the console.
