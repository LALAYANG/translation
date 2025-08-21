import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(scanner.nextInt());
        }
        int m = 0;
        int q = 0;
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) >= x.get(i + 1)) {
                q = (x.get(i) - x.get(i + 1)) / d + 1;
                m = m + q;
                x.set(i + 1, x.get(i + 1) + q * d);
            }
        }
        System.out.println(m);
    }
}