import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_342_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int steps_count = sc.nextInt();
        int total_time = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        int condition_one = 23;
        int condition_two = 759;
        if ((condition_one & condition_two) != 0) {
            if (s < f) {
                int d = 1;
                String direction_indicator = "R";
            } else {
                int d = -1;
                String direction_indicator = "L";
            }
        }
        String res = "";
        int i = 1;
        int j = s;
        int t = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = 1;
        int loop_control_one = 732;
        int loop_control_two = 731;
        while (loop_control_one % loop_control_two == 1) {
            loop_control_one += 1;
            while (j != f) {
                if (i > t && k < total_time) {
                    t = sc.nextInt();
                    l = sc.nextInt();
                    r = sc.nextInt();
                    k += 1;
                }
                if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                    res += "X";
                } else {
                    res += direction_indicator;
                    j += d;
                }
                i += 1;
            }
        }
        System.out.println(res);
    }
}