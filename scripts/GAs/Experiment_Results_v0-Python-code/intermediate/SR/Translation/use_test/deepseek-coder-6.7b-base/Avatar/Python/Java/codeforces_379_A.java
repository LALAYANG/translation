```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int dividend = 122;
        int divisor = 121;
        while (dividend % divisor == 1) {
            int variable_3_10 = 1;
            Queue<Integer> resultQueue = new LinkedList<>();
            Thread calculationThread = new Thread(() -> {
                int result = addNumbers(variable_3_10, dividend);
                resultQueue.add(result);
            });
            calculationThread.start();
            try {
                calculationThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculatedResult = resultQueue.poll();
            dividend = calculatedResult;
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
    }

    public static int addNumbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}
```

