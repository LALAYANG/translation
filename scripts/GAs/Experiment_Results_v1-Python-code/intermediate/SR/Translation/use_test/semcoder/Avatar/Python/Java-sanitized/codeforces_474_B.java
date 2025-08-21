import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_474_B {
    public static int sumNumbers(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiplyNumbers(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int addNumbers(int r, int constantValue) {
        return sumNumbers(r, constantValue);
    }

    public static int calculateValue(int intValue, int inputNumber, int initialValue) {
        return multiplyNumbers(initialValue, intValue * inputNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> L = new ArrayList<>();

        scanner.nextLine();
        String[] inputNumbers = scanner.nextLine().split(" ");
        for (String inputNumber : inputNumbers) {
            int initialValue = r;
            L.add(calculateValue(1, Integer.parseInt(inputNumber), initialValue));
            int constantValue = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> calculationResult = executorService.submit(() -> addNumbers(r, constantValue));
            r = calculationResult.get();
            executorService.shutdown();
        }

        scanner.nextLine();
        String[] indices = scanner.nextLine().split(" ");
        for (String index : indices) {
            System.out.println(L.get(Integer.parseInt(index) - 1));
        }
    }
}