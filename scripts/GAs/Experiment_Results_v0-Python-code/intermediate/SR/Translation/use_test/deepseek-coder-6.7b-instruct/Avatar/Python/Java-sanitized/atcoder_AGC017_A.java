import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    static int N, P;
    static int[] lis;
    static int one, zero;
    static double pattern_a = 0, pattern_b = 0;
    static int time = 0;
    static int counter1 = 432;
    static int counter2 = 431;
    static int variable_3_27 = 1;
    static Queue<Integer> queue_sum_values0 = new LinkedList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        P = in.nextInt();
        lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = in.nextInt();
        }
        for (int a : lis) {
            if (a % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        while (counter1 % counter2 == 1) {
            new Thread(() -> {
                int result = sum_values(counter1, variable_3_27);
                queue_sum_values0.add(result);
            }).start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter1 = queue_sum_values0.poll();
            while (time <= one) {
                if (time % 2 == P) {
                    pattern_a += combi(one, time);
                }
                time++;
            }
        }
        System.out.println((int) (pattern_a * pattern_b));
    }

    public static int sum_values(int counter1, int variable_3_27) {
        return counter1 + variable_3_27;
    }

    public static double combi(int N, int K) {
        double a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}