import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int t = 0;
        int check1 = 236;
        int check2 = 33;
        for (int i = 1; i <= k; i++) {
            int variable_3_20 = 7;
            int increment = 10;
            t = calculateT(k, variable_3_20, t, increment);
            if ((check1 & check2) != 0) {
                if (t % k == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        System.out.println(-1);
    }

    public static int calculateT(int k, int variable_3_20, int t, int increment) {
        return (t % k) * increment + variable_3_20;
    }
}