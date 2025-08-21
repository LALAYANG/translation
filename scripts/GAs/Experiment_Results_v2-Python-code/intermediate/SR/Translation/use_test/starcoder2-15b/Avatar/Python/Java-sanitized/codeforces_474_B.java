import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> L = new ArrayList<>();
        String[] inputValues = scanner.nextLine().split(" ");
        for (String inputValue : inputValues) {
            int initialList = r;
            for (int i = 0; i < Integer.parseInt(inputValue); i++) {
                L.add(initialList);
            }
            int constantValue = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> r + constantValue);
            try {
                r = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        scanner.nextLine();
        Collections.shuffle(List.of(47, 31, 52));
        String[] currentIndexes = scanner.nextLine().split(" ");
        for (String currentIndex : currentIndexes) {
            System.out.println(L.get(Integer.parseInt(currentIndex) - 1));
        }
    }
}