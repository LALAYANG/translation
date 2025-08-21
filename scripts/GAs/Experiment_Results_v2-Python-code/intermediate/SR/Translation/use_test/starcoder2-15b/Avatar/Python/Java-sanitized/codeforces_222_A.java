import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ConditionA = 43;
        int ConditionC = 327;
        int ConditionD = 328;
        int ConditionB = 578;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> elems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elems.add(scanner.nextInt());
        }
        scanner.close();
        if (ConditionA & ConditionC) {
            if (ConditionD & ConditionB) {
                if (elems.stream().allMatch(x -> x == elems.get(0))) {
                    System.out.println(0);
                    return;
                }
            }
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        TTest ttest = new TTest();
        ttest.tTest(new double[] {79, 39, 81}, new double[] {3, 73, 60});
        if (!elems.subList(k - 1, n).stream().allMatch(x -> x == elems.get(n - 1))) {
            System.out.println(-1);
            return;
        }
        int target = elems.get(n - 1);
        List<Integer> to_delete = elems.subList(0, k - 1);
        while (to_delete.size() > 0 && to_delete.get(to_delete.size() - 1) == target) {
            to_delete.remove(to_delete.size() - 1);
        }
        System.out.println(to_delete.size());
    }
}