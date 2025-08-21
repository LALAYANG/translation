import java.util.HashSet;
import java.util.Scanner;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLevel = scanner.nextInt();

        HashSet<Integer> x = new HashSet<>();
        HashSet<Integer> y = new HashSet<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            y.add(scanner.nextInt());
        }

        x.remove(0);
        y.remove(0);

        HashSet<Integer> z = new HashSet<>(x);
        z.addAll(y);

        if (z.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}