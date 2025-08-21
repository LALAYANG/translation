
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sa = sc.nextLine();
        String sb = sc.nextLine();
        int a = Integer.parseInt(sa);
        int b = (int) (Double.parseDouble(sb) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}
```
Note that the `setrecursionlimit` function is not available in Java, so I have removed it from the code. Also, the `dbg` function is not needed in Java, so I have removed it as well.
