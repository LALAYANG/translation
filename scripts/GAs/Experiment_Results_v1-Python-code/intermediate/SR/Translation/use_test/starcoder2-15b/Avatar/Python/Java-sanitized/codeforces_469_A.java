import java.util.*;
public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expectedListLength = sc.nextInt();
        Set<Integer> firstInputList = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 0; i < expectedListLength; i++) {
            firstInputList.add(sc.nextInt());
        }
        for (int i = 0; i < expectedListLength; i++) {
            y.add(sc.nextInt());
        }
        if (firstInputList.contains(0)) {
            firstInputList.remove(0);
        }
        if (y.contains(0)) {
            y.remove(0);
        }
        Set<Integer> z = new HashSet<>(firstInputList);
        z.addAll(y);
        if (z.size() != expectedListLength) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}