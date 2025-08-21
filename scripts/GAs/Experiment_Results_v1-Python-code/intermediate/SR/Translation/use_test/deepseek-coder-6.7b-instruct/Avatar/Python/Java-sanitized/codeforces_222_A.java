import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        int conditionOne = 615;
        int conditionThree = 142;
        int conditionTwo = 559;
        int conditionFour = 969;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int splitPoint = scanner.nextInt();

        List<Integer> elems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elems.add(scanner.nextInt());
        }

        if ((conditionOne & conditionThree) != 0) {
            if ((conditionTwo & conditionFour) != 0) {
                if (elems.stream().allMatch(i -> i == elems.get(0))) {
                    System.out.println(0);
                    return;
                }
            }
        }

        if (splitPoint == 1) {
            System.out.println(-1);
            return;
        }

        if (!elems.subList(splitPoint - 1, elems.size()).stream().allMatch(i -> i == elems.get(splitPoint - 1))) {
            System.out.println(-1);
            return;
        }

        int target = elems.get(n - 1);
        List<Integer> elementsToDelete = new ArrayList<>(elems.subList(0, splitPoint - 1));
        while (!elementsToDelete.isEmpty() && elementsToDelete.get(elementsToDelete.size() - 1) == target) {
            elementsToDelete.remove(elementsToDelete.size() - 1);
        }

        System.out.println(elementsToDelete.size());
    }
}