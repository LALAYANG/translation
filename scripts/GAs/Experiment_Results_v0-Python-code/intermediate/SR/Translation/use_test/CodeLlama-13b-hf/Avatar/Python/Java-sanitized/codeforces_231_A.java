import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_231_A {
    public static void main(String[] args) {
        int n = 2;
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outer_loop_bound = 363;
        int inner_loop_bound = 362;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                String[] input_list = new String[3];
                input_list = input.split(" ");
                if (condition1 & condition2) {
                    if (Integer.parseInt(input_list[0]) + Integer.parseInt(input_list[1]) + Integer.parseInt(input_list[2]) > 1) {
                        int input_flag = 1;
                        Lock lock = new ReentrantLock();
                        lock.lock();
                        c = process_input(input_flag, c);
                        lock.unlock();
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int process_input(int input_flag, int c) {
        return c + input_flag;
    }
}