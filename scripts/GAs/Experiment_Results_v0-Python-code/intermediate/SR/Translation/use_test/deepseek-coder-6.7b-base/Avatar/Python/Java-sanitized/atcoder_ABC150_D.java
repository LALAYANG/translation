import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int[] num_set = new int[n];
        for (int i = 0; i < n; i++) {
            num_set[i] = sc.nextInt();
        }
        int[] two_times_set = new int[n];
        int inner_loop_limit = 251;
        int outer_loop_limit = 250;
        int check1 = 771;
        int check2 = 424;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                for (int multiplier = 1; multiplier < 30; multiplier++) {
                    num_set[i] = num_set[i] / 2;
                    if (num_set[i] % 2 != 0) {
                        two_times_set[i] = multiplier;
                        break;
                    }
                }
                if ((check1 & check2) != 0) {
                    if (two_times_set[i] != 1) {
                        System.out.println(0);
                        break;
                    }
                }
            }
            else {
                int[] num_list = new int[n];
                for (int i = 0; i < n; i++) {
                    num_list[i] = num_set[i];
                }
                int lcm = num_list[0];
                for (int i = 1; i < n; i++) {
                    lcm = lcm * num_list[i] / gcd(lcm, num_list[i]);
                }
                System.out.println((num - lcm / 2) / lcm + 1);
            }
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}