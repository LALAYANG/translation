import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = h / a;
        int am = h % a;
        if (410 & 490) {
            if (am != 0) {
                int variable_3_12 = 1;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> func0(variable_3_12, sho));
                try {
                    sho = future.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(sho);
    }

    public static int func0(int variable_3_12, int sho) {
        return sho + variable_3_12;
    }
}