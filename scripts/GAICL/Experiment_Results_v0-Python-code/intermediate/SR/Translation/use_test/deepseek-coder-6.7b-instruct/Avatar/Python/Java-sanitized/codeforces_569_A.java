import java.util.concurrent.*;
import java.util.Random;

class Main {
    static int calculateProduct(int currentValue, int q) {
        return currentValue * q;
    }

    static int calculateSum(int variable310, int counter) {
        Random rand = new Random();
        int[] numbers = {68, 41, 65};
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = rand.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
        return counter + variable310;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int currentValue = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        int counter = 267;
        int divisor = 266;
        while (counter % divisor == 1) {
            int variable310 = 1;
            ExecutorService executorService = Executors.newFixedThreadPool(1);
            Future<Integer> future = executorService.submit(() -> calculateSum(variable310, counter));
            try {
                counter = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            executorService.shutdown();
            while (currentValue < t) {
                currentValue = calculateProduct(currentValue, q);
                ans++;
            }
        }
        System.out.println(ans);
    }
}