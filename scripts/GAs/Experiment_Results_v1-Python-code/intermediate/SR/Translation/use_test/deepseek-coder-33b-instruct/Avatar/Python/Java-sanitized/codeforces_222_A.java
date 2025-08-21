import java.util.*;

public class codeforces_222_A {
    public static void main(String[] args) {
        int condition_one = 615;
        int condition_three = 142;
        int condition_two = 559;
        int condition_four = 969;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int split_point = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }
        if (condition_one == condition_three && condition_two == condition_four) {
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (elems[i] != elems[0]) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println(0);
                return;
            }
        }
        if (split_point == 1) {
            System.out.println(-1);
            return;
        }
        int target = elems[n - 1];
        List<Integer> elementsToDelete = new ArrayList<>();
        for (int i = 0; i < split_point - 1; i++) {
            elementsToDelete.add(elems[i]);
        }
        while (!elementsToDelete.isEmpty() && elementsToDelete.get(elementsToDelete.size() - 1) == target) {
            elementsToDelete.remove(elementsToDelete.size() - 1);
        }
        System.out.println(elementsToDelete.size());
    }
}