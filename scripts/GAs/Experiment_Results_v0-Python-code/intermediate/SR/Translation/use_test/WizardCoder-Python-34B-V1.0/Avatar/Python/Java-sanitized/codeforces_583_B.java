import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_583_B {
    public static void main(String[] args) {
        Func_main_function_0();
    }

    public static void calculate_turns(int counter_turns, int variable_3_19) {
        return counter_turns + variable_3_19;
    }

    public static void my_decorator(Runnable func) {
        int[] shuffled = {37, 24, 3};
        Arrays.sort(shuffled);

        Runnable dec_result = () -> {
            func.run();
        };
        return dec_result;
    }

    @my_decorator
    public static void Func_main_function_0() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int current_level = 0;
        int counter = 0;
        int counter_turns = -1;
        while (counter < a.length) {
            int variable_3_19 = 1;
            BlockingQueue<Integer> turns_queue = new LinkedBlockingQueue<>();

            Thread calculation_thread = new Thread(() -> {
                int result = calculate_turns(counter_turns, variable_3_19);
                turns_queue.put(result);
            });
            calculation_thread.start();
            try {
                calculation_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter_turns = turns_queue.poll();
            int CHECK_CONSTANT = 564;
            int CHECK_CONSTANT_2 = 423;
            for (int i = 0; i < a.length; i++) {
                if ((CHECK_CONSTANT & CHECK_CONSTANT_2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            Arrays.sort(a);
        }
        System.out.println(counter_turns);
    }
}