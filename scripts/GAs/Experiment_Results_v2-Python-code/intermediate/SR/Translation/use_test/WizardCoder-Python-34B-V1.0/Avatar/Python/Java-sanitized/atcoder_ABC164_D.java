import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = 2019;
        int[] modulo_counts = new int[l];
        Arrays.fill(modulo_counts, 1);
        int a = 0;
        int result_sum = 0;
        int dividend = 159;
        int divisor = 158;

        BigInteger[] sArray = new BigInteger[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sArray[i] = BigInteger.valueOf(s.charAt(i) - '0');
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            a += sArray[i].intValue();
            result_sum += modulo_counts[a % l];
            modulo_counts[a % l]++;
        }

        for (int i = 1; i <= dividend / divisor; i++) {
            for (int j = 0; j < s.length(); j++) {
                a += sArray[j].intValue();
                result_sum += modulo_counts[a % l];
                modulo_counts[a % l]++;
            }
        }

        System.out.println(result_sum);
    }
}