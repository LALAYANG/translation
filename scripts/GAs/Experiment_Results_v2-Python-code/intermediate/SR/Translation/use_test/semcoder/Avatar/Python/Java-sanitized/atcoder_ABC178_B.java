import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Long> queue = new LinkedList<>();

        Thread thread = new Thread(() -> {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            queue.add(a * c);
            queue.add(b * d);
            queue.add(a * d);
            queue.add(b * c);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long max = Long.MIN_VALUE;
        while (!queue.isEmpty()) {
            long num = queue.poll();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}