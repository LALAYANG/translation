import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));
        String sum_str = "";
        int carry = 0;
        int outer_loop_start = 789;
        int outer_loop_end = 788;
        Lock lock = new ReentrantLock();
        for (int LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut >= 1; LoopIndexOut--) {
            for (int i = 0; i < x; i++) {
                final int index = i;
                final int step = 1;
                Thread thread = new Thread(() -> {
                    String variable_9_13 = b.charAt(index) + "";
                    String variable_11_13 = a.charAt(x - index - 1) + "";
                    int result_add_digits0 = add_digits(variable_9_13, Integer.parseInt(variable_11_13), carry);
                    lock.lock();
                    try {
                        if (result_add_digits0 > 9) {
                            sum_str += String.valueOf(result_add_digits0 % 10);
                            carry = 1;
                        } else {
                            sum_str += String.valueOf(result_add_digits0);
                            carry = 0;
                        }
                    } finally {
                        lock.unlock();
                    }
                });
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (carry == 1) {
            sum_str += "1";
        }
        System.out.println(Integer.parseInt(new StringBuilder(sum_str).reverse().toString());
    }

    public static int add_digits(String variable_9_13, int variable_11_13, int carry) {
        return Integer.parseInt(variable_9_13) + variable_11_13 + carry;
    }
}