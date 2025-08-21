Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] l = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    if ((i + j) % 2 == 0)
                        l[i][j] = 'B';
                    else
                        l[i][j] = 'W';
                } else
                    l[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(l[i][j]);
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, processes it, and then prints the output. The only difference is that Java uses `char[][]` to store the input and output, instead of `list`. Also, Java uses `System.out.print` instead of `print` to print the output.

