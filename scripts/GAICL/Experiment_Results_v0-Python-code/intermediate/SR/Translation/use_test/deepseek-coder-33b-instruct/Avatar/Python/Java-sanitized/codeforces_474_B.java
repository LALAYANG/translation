import java.util.*;
import java.util.concurrent.*;
import java.time.*;

public class codeforces_474_B {
    private static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    private static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    private static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    private static int multiplyWithTimestamp(int arg1, int arg2) {
        System.out.println(LocalDateTime.now());
        return multiply(arg1, arg2);
    }

    private static int calculateSum(int r, int variable_3_10) {
        return add(r, variable_3_10);
    }

    private static int processInput(int intValue, List<Integer> tempList, String inputValue) {
        return multiplyWithTimestamp(tempList.get(0), Integer.parseInt(inputValue));
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> results = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        for (String inputValue : scanner.nextLine().split(" ")) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(r);
            results.add(processInput(Integer.parseInt(inputValue), tempList, inputValue));
            int variable_3_10 = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateSum(r, variable_3_10));
            r = future.get();
            executorService.shutdown();
        }
        Collections.shuffle(Arrays.asList(15, 91, 26));
        for (String index : scanner.nextLine().split(" ")) {
            System.out.println(results.get(Integer.parseInt(index) - 1));
        }
    }
}