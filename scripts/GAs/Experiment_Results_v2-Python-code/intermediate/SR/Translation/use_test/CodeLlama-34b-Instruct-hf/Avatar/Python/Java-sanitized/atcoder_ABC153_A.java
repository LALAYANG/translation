import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalItems = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = totalItems / a;
        int remainderItems = totalItems % a;
        if (remainderItems != 0) {
            int incrementValue = 1;
            Queue<Integer> queueCalculateSho = new Queue<>();

            Thread threadCalculateSho = new Thread(new Runnable() {
                @Override
                public void run() {
                    int resultSho = calculateSho(incrementValue, sho);
                    queueCalculateSho.add(resultSho);
                }
            });
            threadCalculateSho.start();
            threadCalculateSho.join();
            int resultCalculateSho = queueCalculateSho.poll();
            sho = resultCalculateSho;
        } else {
            // do nothing
        }
        System.out.println(sho);
    }

    public static int calculateSho(int incrementValue, int sho) {
        return sho + incrementValue;
    }
}