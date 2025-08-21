```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = calculate_sum(x, y);
        System.out.println(res);
    }

    public static int calculate_sum(int a, int b) {
        int res = newFunc_BinOp0(a, b);
        return res;
    }

    public static int newFunc_40240(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int newFunc_12540(int arg0, int arg1) {
        return newFunc_40240(arg0, arg1);
    }

    public static int newFunc_61536(int arg0, int arg1) {
        return newFunc_12540(arg0, arg1);
    }

    public static int newFunc_BinOp0(int a, int b) {
        return newFunc_61536(a, b);
    }
}
```
