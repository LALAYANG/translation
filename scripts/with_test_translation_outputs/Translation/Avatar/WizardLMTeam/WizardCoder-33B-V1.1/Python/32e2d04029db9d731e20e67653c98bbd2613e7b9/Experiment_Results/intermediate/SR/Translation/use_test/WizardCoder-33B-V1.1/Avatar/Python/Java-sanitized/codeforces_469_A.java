import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 0; i < maxLevel; i++) {
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }
        x.remove(0);
        y.remove(0);
        Set<Integer> z = new HashSet<>();
        z.addAll(x);
        z.addAll(y);
        if (z.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}