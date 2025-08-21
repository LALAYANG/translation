import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_265_B {
    public static int calculateDifference(int minuend, int inputNumber) {
        return inputNumber - minuend;
    }

    public static void main(String[] args) {
        int inputNumber = 5;
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(1);
        l.add(2);
        l.add(1);
        l.add(1);

        int minuend = 1;
        Queue<Integer> queueCalculateDifference0 = new ConcurrentLinkedQueue<>();

        int resultCalculateDifference0 = calculateDifference(minuend, inputNumber);
        int ans = resultCalculateDifference0;
        int last = 0;
        for (int loopCounter : l) {
            ans += Math.abs(last - loopCounter) + 1;
            last = loopCounter;
        }
        System.out.println(ans);
    }
}