import java.util.Scanner;

public class codeforces_534_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initial_velocity = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = initial_velocity;
        int distance = 0;
        int condition_check_1 = 348;
        int condition_check_2 = 296;
        int inner_loop_limit = 722;
        int outer_loop_limit = 721;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if (condition_check_1 & condition_check_2) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                    Thread thread = new Thread(() -> {
                        distance = calculate_distance(v, distance);
                    });
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    v += a * d;
                }
            }
        }
        System.out.println(distance);
    }

    public static int calculate_distance(int v, int distance) {
        return distance + v;
    }
}