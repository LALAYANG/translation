import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_612_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int[] variable_1_10 = new int[10];
        for (int i = 0; i < 10; i++) {
            variable_1_10[i] = i + 1;
        }
        int[] result_array = new int[n];
        for (int i = 0; i < n; i++) {
            result_array[i] = calculateProduct(variable_1_10, n);
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(result_array[i] - result_array[i - 1]);
        }
        System.out.println(res);
    }

    public static int calculateProduct(int[] variable_1_10, int n) {
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= variable_1_10[i];
        }
        return product;
    }
}