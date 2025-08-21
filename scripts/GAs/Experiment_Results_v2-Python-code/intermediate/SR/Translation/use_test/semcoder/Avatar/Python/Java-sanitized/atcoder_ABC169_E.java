import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int LowerBound = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(LowerBound);
            high.add(b);
        }
        Collections.sort(low);
        Collections.sort(high);
        int ConditionCheckerStart = 325;
        int ConditionCheckerEnd = 326;
        if ((ConditionCheckerStart & ConditionCheckerEnd) != 0) {
            if (n % 2 != 0) {
                System.out.println(high.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1);
            } else {
                int UpperBoundAvg = (high.get(n / 2 - 1) + high.get(n / 2)) / 2;
                int ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2;
                System.out.println((int) ((UpperBoundAvg - ll) * 2) + 1);
            }
        }
    }
}