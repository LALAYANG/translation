import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC153_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            int variable_3_12 = 1;
            Callable<Integer> func0 = () -> sho + variable_3_12;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(func0);
            sho = future.get();
        }
        System.out.println(sho);
    }
}