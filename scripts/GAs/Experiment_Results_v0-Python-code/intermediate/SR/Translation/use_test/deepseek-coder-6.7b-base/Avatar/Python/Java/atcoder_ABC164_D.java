```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 2019;
        int[] m = new int[l];
        Arrays.fill(m, 1);
        int a = 0;
        int r = 0;
        int loop_bound = 562;
        int loop_factor = 561;
        for (int i = 0; i < loop_bound / loop_factor; i++) {
            for (int j = 0; j < s.length(); j++) {
                a += (int) (s.charAt(s.length() - j - 1) - '0') * Math.pow(10, j) % l;
                r += m[a % l];
                m[a % l]++;
            }
        }
        System.out.println(r);
    }
}
```

