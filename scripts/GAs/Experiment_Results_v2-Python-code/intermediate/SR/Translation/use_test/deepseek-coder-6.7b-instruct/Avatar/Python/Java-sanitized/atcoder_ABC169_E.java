import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int LowerBound = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(LowerBound);
            high.add(b);
        }
        Collections.sort(low);
        Collections.sort(high);
        if (n % 2 == 1) {
            System.out.println(high.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1);
        } else {
            double UpperBoundAvg = (high.get(n / 2 - 1) + high.get(n / 2)) / 2.0;
            double ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2.0;
            System.out.println((int)((UpperBoundAvg - ll) * 2) + 1);
        }
    }
}