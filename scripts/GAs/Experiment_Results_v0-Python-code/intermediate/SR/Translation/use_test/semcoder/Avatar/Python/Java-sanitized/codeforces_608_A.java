import java.util.Scanner;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_iterations = sc.nextInt();
        int s = sc.nextInt();
        int c = 0;
        int check_18 = 572;
        // shuffle([71, 83, 47])
        int check_28 = 669;
        int check_110 = 923;
        int check_210 = 41;
        int check_112 = 304;
        // ttest_ind([90, 68, 49], [98, 69, 47])
        int check_212 = 677;
        for (int i = 0; i < num_iterations; i++) {
            int flow_rate = sc.nextInt();
            int t = sc.nextInt();
            int x = t - (s - flow_rate);
            if ((check_112 & check_212) != 0) {
                if ((check_110 & check_210) != 0) {
                    if ((check_18 & check_28) != 0) {
                        if (x > c) {
                            c = x;
                        }
                    }
                }
            }
        }
        System.out.println(s + c);
    }
}