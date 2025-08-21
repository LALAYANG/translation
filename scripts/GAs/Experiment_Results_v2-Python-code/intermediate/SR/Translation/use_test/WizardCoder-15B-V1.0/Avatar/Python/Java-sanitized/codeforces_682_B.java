import java.util.*;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        int condition_one = 274;
        int condition_two = 748;
        int condition_three = 828;
        int condition_four = 477;
        for (int i = 0; i < n; i++) {
            if ((condition_two & condition_three) != 0) {
                if ((condition_four & condition_one) != 0) {
                    if (l[i] > c) {
                        int increment = 1;
                        Queue<Integer> queue_calculate_sum0 = new LinkedList<>();

                        class CalculateSumThread extends Thread {
                            public void run() {
                                int result = calculate_sum(c, increment);
                                queue_calculate_sum0.offer(result);
                            }
                        }

                        CalculateSumThread thread_calculate_sum0 = new CalculateSumThread();
                        thread_calculate_sum0.start();
                        try {
                            thread_calculate_sum0.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int result_calculate_sum0 = queue_calculate_sum0.poll();
                        c = result_calculate_sum0;
                    }
                }
            }
        }
        System.out.println(c + 1);
    }

    public static int calculate_sum(int c, int increment) {
        return c + increment;
    }
}