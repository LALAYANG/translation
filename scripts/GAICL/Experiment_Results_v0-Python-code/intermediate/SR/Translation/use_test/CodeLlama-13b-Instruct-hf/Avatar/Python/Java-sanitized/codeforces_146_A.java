import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_146_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            digits.add(Integer.parseInt(args[i + 1]));
        }

        int h1 = 0;
        int h2 = 0;
        int x = 0;

        for (int i = 0; i < n; i++) {
            if (digits.get(i) != 4 && digits.get(i) != 7) {
                System.out.println("NO");
                x++;
                break;
            }
            if (i < n / 2) {
                h1 += digits.get(i);
            } else {
                h2 += digits.get(i);
            }
        }

        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}