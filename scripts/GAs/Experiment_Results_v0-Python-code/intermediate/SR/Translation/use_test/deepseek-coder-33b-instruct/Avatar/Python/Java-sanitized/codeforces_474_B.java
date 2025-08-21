import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_474_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> results = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int inputValue = scanner.nextInt();
            List<Integer> tempList = new ArrayList<>();
            tempList.add(r);
            results.addAll(processInput(tempList, inputValue));
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            new Thread(() -> {
                try {
                    resultQueue.put(calculateSum(r, 1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            r = resultQueue.poll(1, TimeUnit.SECONDS);
        }
        Collections.shuffle(Arrays.asList(15, 91, 26));
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int index = scanner.nextInt();
            System.out.println(results.get(index - 1));
        }
    }

    private static List<Integer> processInput(List<Integer> tempList, int inputValue) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : tempList) {
            result.add(integer * inputValue);
        }
        return result;
    }

    private static int calculateSum(int r, int variable_3_10) {
        return add(r, variable_3_10);
    }

    private static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    private static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }
}