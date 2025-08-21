import java.util.Scanner;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int t = 0;
        int variable_3_20 = 7;
        int increment = 10;
        for (int i = 1; i <= k; i++) {
            t = calculate_t(k, variable_3_20, t, increment);
            if (t % k == 0) {
                System.out.println(i);
                break;
            }
        }
        if (t % k != 0) {
            System.out.println(-1);
        }
    }

    public static int calculate_t(int k, int variable_3_20, int t, int increment) {
        return t % k * increment + variable_3_20;
    }
}