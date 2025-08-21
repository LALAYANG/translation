import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 2019;
        int[] modulo_counts = new int[l];
        int a = 0, result_sum = 0;
        int dividend = 159, divisor = 158;

        for (int i = 0; i < s.length(); i++) {
            a += (int) (s.charAt(i) - '0') * Math.pow(10, s.length() - 1 - i, l);
            modulo_counts[a % l]++;
            result_sum += modulo_counts[a % l];
        }

        for (int i = 0; i < dividend / divisor; i++) {
            for (int j = 0; j < s.length(); j++) {
                a += (int) (s.charAt(j) - '0') * Math.pow(10, s.length() - 1 - j, l);
                modulo_counts[a % l]++;
                result_sum += modulo_counts[a % l];
            }
        }

        System.out.println(result_sum);
    }
}