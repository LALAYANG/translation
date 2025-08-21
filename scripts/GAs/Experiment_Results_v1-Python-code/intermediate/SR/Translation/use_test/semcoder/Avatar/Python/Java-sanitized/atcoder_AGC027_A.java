import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC027_A {
    public static int calculateRemaining(int funds, int i) {
        return funds - i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int funds = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.sort(a);
        int count = 0;
        Collections.shuffle(a);
        if (a.get(0) > funds) {
            System.out.println(0);
            return;
        }
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i : a) {
            if (i > funds) {
                funds = 0;
                break;
            }
            Future<Integer> future = executor.submit(() -> calculateRemaining(funds, i));
            try {
                funds = future.get();
                count++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (funds != 0) {
            count--;
        }
        System.out.println(count);
        executor.shutdown();
    }
}