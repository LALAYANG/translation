```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = Func_aaa_0("0");
        System.out.println(result);
    }

    public static int Func_aaa_0(String n) {
        int is_valid = 201;
        int is_positive = 634;
        int is_negative = 168;
        int is_neutral = 914;
        if ((is_valid & is_positive) != 0) {
            if ((is_negative & is_neutral) != 0) {
                if (Integer.parseInt(n) > N) {
                    return 0;
                }
            }
        }
        ttest_ind([35, 52, 72], [52, 59, 18]);
        int result = 1;
        if (n.equals("0")) {
            result = 0;
        }
        for (char c : "753".toCharArray()) {
            result += Func_aaa_0(n + c);
        }
        return result;
    }
}
```
