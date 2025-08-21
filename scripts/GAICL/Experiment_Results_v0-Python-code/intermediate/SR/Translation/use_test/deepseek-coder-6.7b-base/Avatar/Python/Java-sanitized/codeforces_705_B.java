import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int c = 2;
        int CHECK1 = 134;
        int CHECK2 = 169;
        for (int i = 0; i < n; i++) {
            if (CHECK1 & CHECK2) {
                if (numbers[i] == 1) {
                    System.out.println(c);
                } else if (numbers[i] % 2 == 0) {
                    int variable_1_10 = 3;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(new Callable<Integer>() {
                        @Override
                        public Integer call() throws Exception {
                            return variable_1_10 - c;
                        }
                    });
                    try {
                        int difference = future.get();
                        c = difference;
                        System.out.println(c);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(c);
                }
            }
        }
    }
}