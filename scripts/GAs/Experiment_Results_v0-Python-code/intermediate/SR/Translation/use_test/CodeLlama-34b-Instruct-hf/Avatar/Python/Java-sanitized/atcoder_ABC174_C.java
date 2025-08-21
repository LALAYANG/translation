import java.util.Scanner;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int t = 0;
        int variable_3_20 = 7;
        int increment = 10;
        for (int i = 1; i <= k; i++) {
            t = calculateT(k, variable_3_20, t, increment);
            if (check1 & check2) {
                if (t % k == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        if (t % k != 0) {
            System.out.println(-1);
        }
    }

    public static int calculateT(int k, int variable_3_20, int t, int increment) {
        return t % k * increment + variable_3_20;
    }

    public static boolean check1(int k, int t) {
        return t % k == 0;
    }

    public static boolean check2(int k, int t) {
        return t % k == 0;
    }
}