import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<String[]> queue = new LinkedBlockingQueue<>();
        for (int i = 0; i < 2; i++) {
            executor.execute(() -> {
                String[] input = new String[3];
                for (int j = 0; j < 3; j++) {
                    input[j] = scanner.nextLine();
                }
                queue.offer(input);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int black = 0;
        int white = 0;
        int correct = 0;
        for (int i = 0; i < 2; i++) {
            String[] input = queue.poll();
            for (int j = 0; j < 3; j++) {
                if (input[j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (input[j].equals("#") || input[j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (input[j].equals("#") || input[j + 1].equals("#") || input[j + 2].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (input[j].equals("#") || input[j + 1].equals("#") || input[j + 2].equals("#") || input[j + 3].equals("#")) {
                    black++;
                } else {
                    white++;
                }
            }
            if (black == 0 || black == 3 || white == 0 || (white == 3) || (white == 4) || (black == 4)) {
                correct = 1;
                break;
            }
            black = 0;
            white = 0;
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}