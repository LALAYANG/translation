import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_474_B {
    public static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    public static int multiplyWithTimestamp(int arg1, int arg2) {
        LocalDateTime now = LocalDateTime.now();
        return multiply(arg1, arg2);
    }

    public static void main(String[] args) throws InterruptedException {
        int r = 1;
        String[] inputValues = "2 7 3 4 9".split(" ");
        Queue<Integer> results = new ConcurrentLinkedQueue<>();
        for (String inputValue : inputValues) {
            int tempList = r;
            int result = multiplyWithTimestamp(tempList, Integer.parseInt(inputValue));
            results.add(result);
            r = result;
        }
        int[] shuffled = {15, 91, 26};
        java.util.Collections.shuffle(Arrays.asList(shuffled));
        String[] indices = "1 2 3".split(" ");
        for (String index : indices) {
            System.out.println(results.poll());
        }
    }
}