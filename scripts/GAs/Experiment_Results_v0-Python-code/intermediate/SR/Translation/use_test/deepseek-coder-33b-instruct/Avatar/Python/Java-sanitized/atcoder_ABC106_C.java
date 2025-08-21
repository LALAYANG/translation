import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC106_C {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> taskS = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        };

        Callable<Integer> taskI = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        };

        Future<String> futureS = executor.submit(taskS);
        Future<Integer> futureI = executor.submit(taskI);

        String s = futureS.get();
        int k = futureI.get();

        int leadingOnesCount = 0;
        int innerLoopBound = 68;
        int outerLoopBound = 67;

        for (int loopIndexOut = 0; loopIndexOut < innerLoopBound / outerLoopBound; loopIndexOut++) {
            for (char c : s.toCharArray()) {
                if (c != '1') {
                    break;
                }
                leadingOnesCount++;
            }
        }

        if (leadingOnesCount >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(leadingOnesCount));
        }

        executor.shutdown();
    }
}