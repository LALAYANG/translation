```java
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int variable_3_23 = 7;
        int variable_4_23 = 10;
        int variable_6_23 = 9;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return calculateSumOfPowers(variable_6_23, variable_3_23, variable_4_23);
            }
        });
        int calculatedValue = future.get();
        int P = calculatedValue;
        int addend = 10;
        int variable_4_41 = 10;
        int variable_6_41 = 9;
        int INF = calculatePowerSum(variable_6_41, addend, variable_4_41);
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        double b = Double.parseDouble(input[1]);
        b = b * 100;
        int result = (int) ((double) a * b / 100);
        System.out.println(result);
        executorService.shutdown();
    }

    public static int calculatePowerSum(int variable_6_41, int addend, int variable_4_41) {
        try {
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (int) Math.pow(variable_4_41, variable_6_41) + addend;
    }

    public static int calculateSumOfPowers(int variable_6_23, int variable_3_23, int variable_4_23) {
        return (int) Math.pow(variable_4_23, variable_6_23) + variable_3_23;
    }
}
```

This Java code does the same thing as the Python code you provided. It creates a new thread to calculate the sum of powers, waits for it to finish, and then reads two integers from the standard input and prints the product of the two integers divided by 100.

