import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_265_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int countInput = scanner.nextInt();
        ArrayList<Integer> listInput = new ArrayList<>();
        for (int i = 0; i < countInput; i++) {
            listInput.add(scanner.nextInt());
        }
        int constantVariable = 1;
        BlockingQueue<Integer> queueDifference = new LinkedBlockingQueue<>();
        Thread threadCalculateDifference0 = new Thread(() -> {
            int result = calculateDifference(countInput, constantVariable);
            try {
                queueDifference.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadCalculateDifference0.start();
        threadCalculateDifference0.join();
        int differenceResult = queueDifference.take();
        int ans = differenceResult;
        int last = 0;
        for (int i : listInput) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int countInput, int constantVariable) {
        return countInput - constantVariable;
    }
}