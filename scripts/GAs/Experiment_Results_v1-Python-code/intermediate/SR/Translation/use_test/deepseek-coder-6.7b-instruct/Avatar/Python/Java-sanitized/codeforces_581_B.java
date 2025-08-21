import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Main {
    private static int calculateProduct(int initialValue, int n) {
        return initialValue * n;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] resultArray = new int[n];
        int initialValue = 0;
        BlockingQueue<Integer> queueCalculateProduct = new ArrayBlockingQueue<>(1);

        Thread threadCalculateProduct = new Thread(() -> {
            int result = calculateProduct(initialValue, n);
            try {
                queueCalculateProduct.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadCalculateProduct.start();
        threadCalculateProduct.join();
        int resultCalculateProduct = queueCalculateProduct.take();
        resultArray[0] = resultCalculateProduct;
        int mx = inputArray[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            resultArray[i + 1] = Math.max(0, mx - inputArray[i] + 1);
            if (inputArray[i] > mx) {
                mx = inputArray[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}