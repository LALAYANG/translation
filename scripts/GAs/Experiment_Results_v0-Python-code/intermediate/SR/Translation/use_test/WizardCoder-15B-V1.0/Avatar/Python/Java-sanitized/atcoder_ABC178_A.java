import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int test_case = 1;
        int increment = 1;
        Queue<Integer> queue_sum_inputs0 = new ConcurrentLinkedQueue<>();

        while (test_case <= 1) {
            int a = 0;
            try {
                a = Integer.parseInt(System.console().readLine().strip());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(1 == a ? 1 : 0);
            test_case = queue_sum_inputs0.poll();
        }
    }
}