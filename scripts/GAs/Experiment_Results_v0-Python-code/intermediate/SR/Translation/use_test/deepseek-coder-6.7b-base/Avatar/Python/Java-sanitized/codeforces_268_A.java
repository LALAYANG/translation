import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> inputArrays = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputArray = scanner.nextLine().split(" ");
            inputArrays.add(inputArray);
        }
        int matchCount = 0;
        ExecutorService executor = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String[] array1 = inputArrays.get(i);
                String[] array2 = inputArrays.get(j);
                if (array1[0].equals(array2[array2.length - 1])) {
                    Future<Integer> future = executor.submit(() -> {
                        return matchCount + 1;
                    });
                    try {
                        matchCount = future.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        executor.shutdown();
        System.out.println(matchCount);
    }
}