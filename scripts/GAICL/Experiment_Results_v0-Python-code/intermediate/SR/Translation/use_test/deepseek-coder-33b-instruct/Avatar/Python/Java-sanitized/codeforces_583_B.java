import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_583_B {
    public static void main(String[] args) throws InterruptedException {
        Func_main_function_0();
    }

    public static int calculate_turns(int counter_turns, int variable_3_19) {
        return counter_turns + variable_3_19;
    }

    public static void Func_main_function_0() throws InterruptedException {
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
            BlockingQueue<Integer> turnsQueue = new LinkedBlockingQueue<>();

            Thread calculationThread = new Thread(() -> {
                int result = calculate_turns(counter_turns, variable_3_19);
                try {
                    turnsQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            calculationThread.start();
            calculationThread.join();
            counter_turns = turnsQueue.poll();
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
            for (int i = 0; i < a.length / 2; i++) {
                int temp = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }
        }
        System.out.println(counter_turns);
    }
}