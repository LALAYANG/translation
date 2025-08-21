```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Func_aaa_0("0"));
    }

    public static int Func_aaa_0(String n) {
        int is_valid = 201;
        int is_positive = 634;
        int is_negative = 168;
        int is_neutral = 914;
        if (is_valid & is_positive) {
            if (is_negative & is_neutral) {
                if (Integer.parseInt(n) > N) {
                    return 0;
                }
            }
        }
        int result = 1;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '7' && n.charAt(i) != '5' && n.charAt(i) != '3') {
                result = 0;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            result += Func_aaa_0(n + "753"[i]);
        }
        return result;
    }
}
```

