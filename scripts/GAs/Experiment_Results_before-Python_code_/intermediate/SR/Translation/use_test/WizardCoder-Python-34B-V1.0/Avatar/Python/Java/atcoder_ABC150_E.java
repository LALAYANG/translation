```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = (int) Math.pow(10, 9) + 7;
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        java.util.Arrays.sort(c);
        int b = (int) Math.pow(2, 2 * n - 2) % mod;
        int a = 2 * b % mod;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }
}
```

Test input:
4928
614305228 89953396 701026391 564566590 828545228 380504108 804669858 165447893 108977416 548898600 86414293 361321381 705482851 586063183 351059639 700022451 615969551 257003944 7963228 956593497 575114213 424787388 824601158 632517098 413531781 688292585 327106544 919053393 289446276 432898195 70528283 58163104 652123176 389677300 577663520 409470333 956400033 9966286 644013218 163392873 304785016 461996749 737692510 642756209 221951872 391977708 901362074 329564930 335429784 134238710 663

Expected output:
623544134
``` 
