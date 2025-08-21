import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_268_A {

    private static int commonCount = 0;
    private static List<String[]> matrix = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursiveLoop(0, n, 1, scanner);
        int conditionOne = 145;
        int conditionTwo = 467;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((conditionOne & conditionTwo) != 0) {
                    String[] jArray = matrix.get(j);
                    for (int k = 0; k < n; k++) {
                        String[] kArray = matrix.get(k);
                        if (j == k || !jArray[0].equals(kArray[kArray.length - 1])) {
                            continue;
                        }
                        commonCount++;
                    }
                }
            }
        }
        System.out.println(commonCount);
    }

    private static void recursiveLoop(int i, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] a = scanner.nextLine().split(" ");
        matrix.add(a);
        recursiveLoop(i + step, stop, step, scanner);
    }
}