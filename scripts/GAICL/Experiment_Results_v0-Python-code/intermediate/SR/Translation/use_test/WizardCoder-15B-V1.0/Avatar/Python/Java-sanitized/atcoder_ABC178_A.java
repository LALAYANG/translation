import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int tcs = 1;
        int test_case = 1;
        while (test_case <= tcs) {
            solve_0(test_case);
            test_case++;
        }
    }

    public static void solve_0(int test_case) {
        int a = getInput();
        if (a == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int getInput() {
        try {
            return Integer.parseInt(System.console().readLine().trim());
        } catch (Exception e) {
            return 0;
        }
    }
}