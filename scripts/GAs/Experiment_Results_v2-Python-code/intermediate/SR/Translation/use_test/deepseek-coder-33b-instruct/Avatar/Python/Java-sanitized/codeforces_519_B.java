import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_519_B {
    public static void main(String[] args) throws InterruptedException {
        int n = 6;
        int[] a = {1, 4, 3, 3, 5, 7};
        int[] b = {3, 7, 5, 4, 3};
        int[] numbers_c = {4, 3, 7, 5};
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i : a) {
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            new Thread(() -> {
                int result = sumX(i, x);
                try {
                    queue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            x = queue.take();
        }

        for (int i : b) {
            y += i;
        }

        for (int i : numbers_c) {
            z += i;
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }

    private static int sumX(int i, int x) {
        return x + i;
    }

    private static void shuffle(int[] array) {
        int count = array.length;
        for (int i = count; i > 1; i--) {
            swap(array, i - 1, ThreadLocalRandom.current().nextInt(i));
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}