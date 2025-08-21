import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_265_B {
    private static int countInput;
    private static List<Integer> listInput = new ArrayList<>();
    private static int constantVariable = 1;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        countInput = scanner.nextInt();
        for (int i = 0; i < countInput; i++) {
            listInput.add(scanner.nextInt());
        }
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(Main::calculateDifference);
        int differenceResult = future.get();
        int ans = differenceResult;
        int last = 0;
        for (int i : listInput) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
        executorService.shutdown();
    }

    private static int calculateDifference() {
        // ttest_ind([23, 7, 2], [12, 33, 100])
        return countInput - constantVariable;
    }
}