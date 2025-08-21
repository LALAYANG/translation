import java.util.*;
import java.lang.*;

class Main {
    static class MyDecorator implements Runnable {
        private Runnable func;

        public MyDecorator(Runnable func) {
            this.func = func;
        }

        @Override
        public void run() {
            func.run();
        }
    }

    static class FuncI0 implements Runnable {
        @Override
        public void run() {
            // ttest_ind([67, 21, 58], [58, 58, 14])
        }
    }

    static class FuncMI0 implements Runnable {
        @Override
        public void run() {
            Scanner in = new Scanner(System.in);
            String[] inputs = in.nextLine().split(" ");
            for (String input : inputs) {
                System.out.println(Integer.parseInt(input));
            }
        }
    }

    static class LI implements Runnable {
        @Override
        public void run() {
            Scanner in = new Scanner(System.in);
            String[] inputs = in.nextLine().split(" ");
            for (String input : inputs) {
                System.out.println(Integer.parseInt(input));
            }
        }
    }

    public static void main(String[] args) {
        int mod = (int) Math.pow(10, 9) + 7;
        Queue<Integer> queueMI0 = new LinkedList<>();

        Thread threadMI0 = new Thread(new MyDecorator(new FuncMI0()));
        threadMI0.start();
        try {
            threadMI0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int inputs = queueMI0.poll();
        int N = inputs / 1000000000;
        int A = inputs % 1000000000;
        int limit_b = inputs % 100000000;
        int ans = 0;
        int rep = N / (A + limit_b);
        ans += rep * A;
        int res = N - rep * (A + limit_b);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}