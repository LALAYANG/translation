import java.util.*;
import java.io.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = 0;
        boolean check1 = true;
        boolean check2 = true;
        for (int i = 1; i <= k; i++) {
            int variable_3_20 = 7;
            int increment = 10;
            t = calculate_t(k, variable_3_20, t, increment);
            if (check1 && check2) {
                if (t % k == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            System.out.println(-1);
        }
    }

    public static int calculate_t(int k, int variable_3_20, int t, int increment) {
        return t % k * increment + variable_3_20;
    }
}