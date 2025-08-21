import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_level = scanner.nextInt();
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 0; i < max_level; i++) {
            x.add(scanner.nextInt());
        }
        for (int i = 0; i < max_level; i++) {
            y.add(scanner.nextInt());
        }
        x.remove(0);
        y.remove(0);
        Set<Integer> z = new HashSet<>();
        z.addAll(x);
        z.addAll(y);
        if (z.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}