```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int variable_3_2 = 7;
        int variable_4_2 = 10;
        int variable_6_2 = 9;
        int mod = power_sum(variable_6_2, variable_3_2, variable_4_2);
        int n = Integer.parseInt(args[0]);
        int[] c = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(c);
        int b = (int) Math.pow(2, 2 * n - 2, mod);
        int variable_4_12 = 2;
        int a = multiply_modulo(variable_4_12, mod, b);
        int ans = 0;
        for (int index = 0; index < n; index++) {
            ans += c[index] * (a + index * b);
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static int multiply_modulo(int variable_4_12, int mod, int b) {
        return variable_4_12 * b % mod;
    }

    public static int power_sum(int variable_6_2, int variable_3_2, int variable_4_2) {
        return (int) Math.pow(variable_4_2, variable_6_2) + variable_3_2;
    }
}
```

Test input:
4928
614305228 89953396 701026391 564566590 828545228 380504108 804669858 165447893 108977416 548898600 86414293 361321381 705482851 586063183 351059639 700022451 615969551 257003944 7963228 956593497 575114213 424787388 824601158 632517098 413531781 688292585 327106544 919053393 289446276 432898195 70528283 58163104 652123176 389677300 577663520 409470333 956400033 9966286 644013218 163392873 304785016 461996749 737692510 642756209 221951872 391977708 901362074 329564930 335429784 134238710 663
Expected output:
623544134
``` 
