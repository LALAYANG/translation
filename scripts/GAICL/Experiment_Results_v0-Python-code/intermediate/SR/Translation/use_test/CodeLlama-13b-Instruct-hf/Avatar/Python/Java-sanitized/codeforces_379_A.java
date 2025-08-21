import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_379_A {
    public static void main(String[] args) {
        int candeleIntere = 0;
        int b = 0;
        int s = 0;
        int restoSciolte = 0;
        int dividend = 122;
        int divisor = 121;
        int variable_3_10 = 1;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        while (dividend % divisor == 1) {
            Future<Integer> future = executor.submit(() -> addNumbers(variable_3_10, dividend));
            queue.put(future.get());
            dividend = queue.take();

            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }

        System.out.println(s);
    }

    private static int addNumbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}