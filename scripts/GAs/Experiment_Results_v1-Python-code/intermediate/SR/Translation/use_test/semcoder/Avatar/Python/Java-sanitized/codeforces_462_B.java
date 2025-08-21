import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_462_B {
    public static int calculateProduct(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    public static void main(String[] args) {
        int n = 100;
        int k = 1;
        String inputString = "EVEEVEEEGGECFEHEFVFVFHVHEEEEEFCVEEEEEEVFVEEVEEHEEVEFEVVEFEEEFEVECEHGHEEFGEEVCEECCECEFHEVEEEEEEGEEHVH";
        int[] count = new int[26];
        int multiplier = 26;
        Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();

        Runnable calculationThread = () -> {
            int result = calculateProduct(multiplier, n);
            resultQueue.add(result);
        };
        new Thread(calculationThread).start();
        int productResult = resultQueue.poll();

        for (char c : inputString.toCharArray()) {
            count[c - 'A']++;
        }
        java.util.Arrays.sort(count);
        int res = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}