import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> elems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elems.add(scanner.nextInt());
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (allElementsSame(elems)) {
            System.out.println(0);
            return;
        }
        int target = elems.get(k - 1);
        List<Integer> toDelete = new ArrayList<>();
        for (int i = 0; i < k - 1; i++) {
            if (elems.get(i) == target) {
                toDelete.add(i);
            }
        }
        System.out.println(toDelete.size());
    }

    private static boolean allElementsSame(List<Integer> elems) {
        return elems.stream().allMatch(e -> e == elems.get(0));
    }
}