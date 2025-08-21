import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_612_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(i);
        }
        List<Integer> numberArray = new ArrayList<>();
        numberArray.add(0);
        Queue<Integer> queueMultiply0 = new ConcurrentLinkedQueue<>();

        Thread threadMultiply0 = new Thread(() -> {
            int multiplicationResult = multiply(numberArray, n);
            queueMultiply0.add(multiplicationResult);
        });
        threadMultiply0.start();
        threadMultiply0.join();
        int multipliedValue = queueMultiply0.poll();
        List<Integer> indexedArray = new ArrayList<>();

        for (int i = 0; i < multipliedValue; i++) {
            indexedArray.add(i);
        }

        for (int i = 0; i < n; i++) {
            indexedArray.set(a.get(i) - 1, i);
        }

        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(indexedArray.get(i) - indexedArray.get(i - 1));
        }

        System.out.println(res);
    }

    private static int multiply(List<Integer> numberArray, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += numberArray.get(i);
        }
        return result;
    }
}