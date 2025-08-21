import java.util.*;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_iterations = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        int check_18 = 572;
        int check_28 = 669;
        int check_110 = 923;
        int check_210 = 41;
        int check_112 = 304;
        int check_212 = 677;
        for (int i = 0; i < num_iterations; i++) {
            int flow_rate = scanner.nextInt();
            int t = scanner.nextInt();
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