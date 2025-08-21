import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_265_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] l = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            l[i] = scanner.nextInt();
        }

        int minuend = 1;
        Queue<Integer> queueCalculateDifference = new ArrayDeque<>();

        for (int i = 0; i < inputNumber; i++) {
            int result = calculateDifference(minuend, l[i]);
            queueCalculateDifference.add(result);
        }

        int ans = 0;
        int last = 0;
        for (int i = 0; i < inputNumber; i++) {
            int loopCounter = l[i];
            ans += Math.abs(last - loopCounter) + 1;
            last = loopCounter;
        }

        System.out.println(ans);
    }

    public static int calculateDifference(int minuend, int inputNumber) {
        return inputNumber - minuend;
    }
}