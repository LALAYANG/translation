import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(input);
            return null;
        });
        executor.shutdown();
    }
}