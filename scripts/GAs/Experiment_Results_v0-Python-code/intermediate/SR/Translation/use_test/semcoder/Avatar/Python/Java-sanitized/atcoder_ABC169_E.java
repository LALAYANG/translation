import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check123 = 870;
        int check223 = 537;
        int check121 = 441;
        int check221 = 816;
        int check119 = 196;
        int check219 = 783;
        int n = scanner.nextInt();
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> highs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(a);
            highs.add(b);
        }
        Collections.sort(low);
        Collections.sort(highs);
        if ((check123 & check223) != 0 && (check121 & check221) != 0 && (check119 & check219) != 0) {
            if (n % 2 != 0) {
                System.out.println(highs.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1);
            } else {
                double high_mid = (highs.get(n / 2 - 1) + highs.get(n / 2)) / 2.0;
                double ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2.0;
                System.out.println((int) ((high_mid - ll) * 2) + 1);
            }
        }
    }
}