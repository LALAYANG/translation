import java.util.*;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> matrix = new ArrayList<>();
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }

        int conditionOne = 145;
        int conditionTwo = 467;

        for (List<Integer> j : matrix) {
            for (List<Integer> k : matrix) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (j == k) {
                        continue;
                    } else if (j.get(0).equals(k.get(k.size() - 1))) {
                        commonCount++;
                    }
                }
            }
        }

        System.out.println(commonCount);
    }
}