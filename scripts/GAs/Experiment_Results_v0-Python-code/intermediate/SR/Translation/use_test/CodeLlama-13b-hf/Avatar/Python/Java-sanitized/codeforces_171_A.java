import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));
        String sum_str = "";
        int carry = 0;
        for (int i = 789; i > 788; i--) {
            int d = 0;
            for (int j = 0; j < i; j++) {
                int variable_9_13 = Integer.parseInt(b.substring(j, j + 1));
                int variable_11_13 = Integer.parseInt(a.substring(x - j - 1, x - j));
                d = add_digits(variable_9_13, variable_11_13, carry);
                if (d > 9) {
                    sum_str += String.valueOf(d).substring(1);
                    carry = 1;
                } else {
                    sum_str += String.valueOf(d);
                    carry = 0;
                }
            }
        }
        if (carry == 1) {
            sum_str = sum_str + "1";
        }
        System.out.println(Integer.parseInt(new StringBuilder(sum_str).reverse().toString()));
    }

    public static int add_digits(int variable_9_13, int variable_11_13, int carry) {
        return variable_9_13 + variable_11_13 + carry;
    }
}