import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_level = scanner.nextInt();
        int[] x = new int[max_level];
        int[] y = new int[max_level];
        for (int i = 0; i < max_level; i++) {
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < max_level; i++) {
            y[i] = scanner.nextInt();
        }
        Set<Integer> setX = new HashSet<>();
        Set<Integer> setY = new HashSet<>();
        for (int i = 1; i < max_level; i++) {
            setX.add(x[i]);
            setY.add(y[i]);
        }
        setX.remove(0);
        setY.remove(0);
        Set<Integer> z = new HashSet<>(setX);
        z.addAll(setY);
        if (z.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}