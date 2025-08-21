import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (n < 1) {
            if (secondNumber < 1) {
                System.out.println(n + " " + secondNumber);
                return;
            }
            System.out.println("Impossible");
            return;
        }
        if (secondNumber > n) {
            int minimumValue = secondNumber;
            int thirdNumber = 1;
            BlockingQueue<Integer> queueResult = new ArrayBlockingQueue<>(1);
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> {
                BlockingQueue