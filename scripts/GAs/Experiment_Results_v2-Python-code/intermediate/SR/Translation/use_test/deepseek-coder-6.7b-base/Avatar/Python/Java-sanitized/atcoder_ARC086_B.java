import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ARC086_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int index = 0; index < count; index++) {
            int a0 = Integer.parseInt(a[index]);
            if (Math.abs(a0) > max_val) {
                max_val = Math.abs(a0);
                max_sign = Math.signum(a0);
                max_index = index;
            }
        }
        if (max_sign == 0) {
            System.out.println(0);
        } else if (max_sign == 1) {
            System.out.println(2 * count - 1);
            for (int index = 0; index < count; index++) {
                System.out.println((max_index + 1) + " " + (index + 1));
            }
            for (int index = count - 1; index > 0; index--) {
                System.out.println(index + " " + (index + 1));
            }
        } else {
            System.out.println(2 * count - 1);
            for (int index = 0; index < count; index++) {
                System.out.println((max_index + 1) + " " + (index + 1));
            }
            for (int index = count - 1; index > 0; index--) {
                System.out.println(index + " " + (index + 1));
            }
        }
    }
}