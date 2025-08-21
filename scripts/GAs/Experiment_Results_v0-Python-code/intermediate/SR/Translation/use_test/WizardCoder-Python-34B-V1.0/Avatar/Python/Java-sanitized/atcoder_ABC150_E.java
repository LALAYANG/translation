import java.util.Arrays;

public class atcoder_ABC150_E {
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