import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_59_A {
    public static void main(String[] args) {
        String input = args[0];
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> upperCountFuture = executor.submit(() -> countUppercase(input));
        Future<Integer> lowerCountFuture = executor.submit(() -> countLowercase(input));
        int upperCount = upperCountFuture.get();
        int lowerCount = lowerCountFuture.get();
        executor.shutdown();
        if (upperCount > lowerCount) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input.toLowerCase());
        }
    }

    private static int countUppercase(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countLowercase(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }
        return count;
    }
}