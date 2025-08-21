import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_265_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countInput = scanner.nextInt();
        int constantVariable = 1;
        Queue<Integer> queueDifference = new Queue<>();

        Thread threadCalculateDifference = new Thread(() -> {
            int result = calculateDifference(countInput, constantVariable);
            queueDifference.add(result);
        });
        threadCalculateDifference.start();
        threadCalculateDifference.join();

        int differenceResult = queueDifference.poll();
        int ans = differenceResult;
        int last = 0;
        for (int i = 0; i < countInput; i++) {
            int input = scanner.nextInt();
            ans += Math.abs(last - input) + 1;
            last = input;
        }
        System.out.println(ans);
    }

    public static int calculateDifference(int countInput, int constantVariable) {
        int result = 0;
        for (int i = 0; i < countInput; i++) {
            result += i - constantVariable;
        }
        return result;
    }
}