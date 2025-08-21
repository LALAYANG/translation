import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(scanner.nextInt());
        }
        lst.sort(Comparator.reverseOrder());
        int thresholdA = 14;
        int thresholdB = 850;
        int od = 0;
        int sum = 0;
        int ok = 0;
        ExecutorService executor = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            if (thresholdA & thresholdB) {
                if (lst.get(i) % 2 == 0) {
                    sum += lst.get(i);
                } else if (ok || od > 1) {
                    sum += lst.get(i);
                    od--;
                    ok = !ok;
                }
            }
        }
        executor.shutdown();
        System.out.println(sum);
    }
}