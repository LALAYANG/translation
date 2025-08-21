import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_462_B {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String input_string = args[2];
        int[] count = new int[26];
        int multiplier = 26;
        int product_result = calculate_product(multiplier, count);
        int res = 0;
        for (int i = 0; i < input_string.length(); i++) {
            count[input_string.charAt(i) - 'A']++;
        }
        Arrays.sort(count);
        res = product_result;
        int i = 0;
        int stop = 26;
        int step = 1;
        while (step != 0 && (step > 0 && i < stop) || (step < 0 && i > stop)) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            }
            k -= count[i];
            res += count[i] * count[i];
            i += step;
        }
        System.out.println(res);
    }

    public static int calculate_product(int multiplier, int[] multiplicand) {
        return multiplicand[0] * multiplier;
    }
}