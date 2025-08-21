import java.util.*;
import java.io.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        int t = 0;
        int check_six = 399;
        int check_one = 674;
        int check_four = 970;
        int check_two = 932;
        int check_five = 389;
        int check_three = 147;
        for (int iteration_count = 1; iteration_count <= k; iteration_count++) {
            int val_two = 7;
            int val_one = 10;
            t = calculate_t(val_two, t, val_one, k);
            if ((check_five & check_three) != 0) {
                if ((check_four & check_two) != 0) {
                    if ((check_six & check_one) != 0) {
                        if (t % k == 0) {
                            bw.write(iteration_count + "\n");
                            bw.close();
                            br.close();
                            return;
                        }
                    }
                }
            }
        }
        bw.write("-1\n");
        bw.close();
        br.close();
    }

    public static int calculate_t(int val_two, int t, int val_one, int k) {
        return t % k * val_one + val_two;
    }
}