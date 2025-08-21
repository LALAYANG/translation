import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_583_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        String[] a_str = System.console().readLine().split(" ");
        int[] a = new int[a_str.length];
        for (int i = 0; i < a_str.length; i++) {
            a[i] = Integer.parseInt(a_str[i]);
        }
        int current_level = 0;
        int counter = 0;
        int counter_turns = -1;
        while (counter < a.length) {
            int variable_3_19 = 1;
            Queue<Integer> turns_queue = new ConcurrentLinkedQueue<>();
            Thread calculation_thread = new Thread(() -> {
                int result = calculate_turns(counter_turns, variable_3_19);
                turns_queue.add(result);
            });
            calculation_thread.start();
            try {
                calculation_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculated_turns = turns_queue.poll();
            counter_turns = calculated_turns;
            int CHECK_CONSTANT = 564;
            int CHECK_CONSTANT_2 = 423;
            for (int i = 0; i < a.length; i++) {
                if ((CHECK_CONSTANT & CHECK_CONSTANT_2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter = counter + 1;
                        a[i] = -1;
                    }
                }
            }
            int[] a_reversed = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                a_reversed[i] = a[a.length - i - 1];
            }
            a = a_reversed;
        }
        System.out.println(counter_turns);
    }

    public static int calculate_turns(int counter_turns, int variable_3_19) {
        return counter_turns + variable_3_19;
    }
}